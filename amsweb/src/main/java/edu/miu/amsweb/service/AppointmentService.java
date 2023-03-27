package edu.miu.amsweb.service;

import edu.miu.amsweb.entity.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> findAllVipList();

    List<Appointment> findSortedAscDateAndTime();


}
