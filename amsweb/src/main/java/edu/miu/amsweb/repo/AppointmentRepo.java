package edu.miu.amsweb.repo;

import edu.miu.amsweb.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
    @Query(value = "select * from appointment as a order by a.appointment_date, a.appointment_time", nativeQuery = true)
    List<Appointment> findSortedAscDateAndTime();




//    @Query(value = "SELECT id, " +
//            "first_name," +
//            "last_name," +
//            " TIMESTAMPDIFF(YEAR, date_of_birth, CURRENT_DATE) AS age, date_of_birth" +
//            "FROM appointment " +
//            "HAVING age = 65" )
//    List<Appointment>   findAppointmentsByAppointmentDateOrderByAppointmentTimeAscAppointmentId();







}

