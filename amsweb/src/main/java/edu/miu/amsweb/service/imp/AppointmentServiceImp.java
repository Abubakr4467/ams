package edu.miu.amsweb.service.imp;

import edu.miu.amsweb.entity.Appointment;
import edu.miu.amsweb.repo.AppointmentRepo;
import edu.miu.amsweb.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImp implements AppointmentService {



    @Autowired
    private AppointmentRepo appointmentRepo;




    @Override
    public List<Appointment> findSortedAscDateAndTime() {
        return appointmentRepo.findSortedAscDateAndTime();
    }


//    @Override
//    public List<Appointment> findAllVipListOfAppointsment() {
//        return appointmentRepo.findAll();
//    }

    @Override
    public List<Appointment> findAllVipList() {
        return appointmentRepo.findAll();
    }

}
