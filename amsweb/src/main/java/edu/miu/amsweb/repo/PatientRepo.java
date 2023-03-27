package edu.miu.amsweb.repo;

import edu.miu.amsweb.entity.Appointment;
import edu.miu.amsweb.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

//    List<Patient> findDistinctByDateOfBirth_YearStartingWith("1958-01-01")


//    List<Patient> findAllByDateOfBirthYearBefore("1958-01-01");

}
