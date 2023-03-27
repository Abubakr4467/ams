package edu.miu.amsweb.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appointmentId;


    @NotNull(message = "appointmentDate reqruired")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date appointmentDate;

    @NotNull(message = "appointmentTime reqruired")
    @JsonFormat(pattern = "HH:mm:ss")
    private Date appointmentTime;


    private String dentistName;

    private String surgeryLocation;


    @ManyToOne
    private Patient patient;




//    appointmentId: long (Primary Key field)
//
//    appointmentDate, REQUIRED (e.g. 2014-09-21, 2013-10-19, etc.)
//
//    appointmentTime, REQUIRED (e.g. 10:00:00, 14:15:00 etc.)
//
//    dentistName: (optional field) (e.g. Mary Long, David Pearson etc.)
//
//    surgeryLocation, (optional field) 
}
