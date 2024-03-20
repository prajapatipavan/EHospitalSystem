package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.patientEntity;

@Repository
public interface AppoinmentRepositry  extends JpaRepository<AppoinmentEntity, Integer>{
	
	
	List<AppoinmentEntity> findBypatientId(Integer patientId);
	List<AppoinmentEntity> findByDoctorId(Integer doctorId);
	
	   AppoinmentEntity findByPatientId(Integer patientId);
	

	
 @Query(value = "select * from appoinment where DayofMonth(appoinment_date) = :DayofMonth",nativeQuery=true)
	
	  List<AppoinmentEntity> getCurruntDayAppointPatient(Integer DayofMonth);
 
 
 @Query(value = "SELECT * FROM appoinment where DayofMonth(appoinment_date) = :dayOfMonth AND doctor_id = :doctorId", nativeQuery = true)
 List<AppoinmentEntity> getCurrentDayAppointmentByDoctor(Integer dayOfMonth, Integer doctorId);

 
 @Query(value = "select * from appoinment where month(appoinment_date) = :month",nativeQuery=true)
	
 List<AppoinmentEntity> getCurruntMonthAppointPatient(Integer month);
 
 
 
 
 @Query(value = "select count(appoinment_id) from appoinment where month(appoinment_date) =:month",nativeQuery=true)
         Integer getCurruntMonthAppoinmentBypatientId(Integer month);
 
 /*@Query(value = "select count(appoinment_id) from appoinment where year(appoinment_date) = :year",nativeQuery=true)
 Integer getCurruntyearAppoinment(Integer year);*/
 
 @Query(value = "select count(appoinment_id) from appoinment where DayOfMonth(appoinment_date) =:DayOfMonth",nativeQuery=true)
 Integer getCurruntdayAppoinment(Integer DayOfMonth ); 
 
 

        
 
	

}
