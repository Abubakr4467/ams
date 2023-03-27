package edu.miu.amsweb.service.imp;

import edu.miu.amsweb.entity.Patient;
import edu.miu.amsweb.repo.PatientRepo;
import edu.miu.amsweb.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PatientServiceImp  implements PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public List<Patient> getAllElderlyList() {
        return null;
    }

    @Override
    public Patient creteOne(Patient patient) {
        return patientRepo.save(patient);
    }


//    LocalDate birthdate = new LocalDate (1958, 1, 1);
//    LocalDate now = new LocalDate();
//    dateOfBirth age = Years.yearsBetween(birthdate, now);
//    System.out.println(age.getYears());
//    @Override
//    public List<Patient> getAllVipElderlyList() {
//        return patientRepo.findAll();
//    }
}
