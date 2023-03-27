package edu.miu.amsweb.controller;

import edu.miu.amsweb.entity.Patient;
import edu.miu.amsweb.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("amsweb/api/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;


    @GetMapping("elderly/list")
    private List<Patient> getAllElderlyList(){
        return patientService.getAllElderlyList();
    }


    @PostMapping("/new")
    private Patient creteOne(@PathVariable @Valid Patient patient){
        Patient patient1 = patientService.creteOne(patient);
        return patient1;
    }
}
