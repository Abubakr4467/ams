package edu.miu.amsweb.service;

import edu.miu.amsweb.entity.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllElderlyList();

    Patient creteOne(Patient patient);
}
