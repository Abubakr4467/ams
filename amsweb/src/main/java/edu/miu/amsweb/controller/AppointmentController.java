package edu.miu.amsweb.controller;

import edu.miu.amsweb.entity.Appointment;
import edu.miu.amsweb.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("amsweb/api/appointment/")
public class AppointmentController {


    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/vip/list")
    private List<Appointment> getAllVipList(){
        return appointmentService.findAllVipList();
    }


    @GetMapping("/upcoming/list")
    private List<Appointment> getAllUpdcomingList(){
        return appointmentService.findSortedAscDateAndTime();
    }


}
