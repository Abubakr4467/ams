package edu.miu.amsweb.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patientId;


    @NotNull(message = " patientNumber reqruired")
    private String patientNumber;


    @NotNull(message = " firstName reqruired")
    private String firstName;

    @NotNull(message = " lastName reqruired")
    private String lastName;


    @NotNull(message = " dateOfBirth reqruired")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;


    @OneToMany(mappedBy = "patient")    //strong side
    private List<Appointment> appointments;

//    patientId: integer, (Primary Key field)
//
//
//    patientNumber, (required field) (e.g. P101, EP117 etc.)
//
//
//
//    firstName, (required field) (e.g. Bob, Anna, Carlos etc.)
//
//
//
//    lastName, (required field) (e.g. Jones, Smith etc.)
//
//
//
//    dateOfBirth, (required field) (e.g. 1997-12-18, 1958-03-27 etc.)






}
