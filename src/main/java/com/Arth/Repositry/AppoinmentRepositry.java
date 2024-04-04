package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.dto.Appoinmentdto;


@Repository
public interface AppoinmentRepositry  extends JpaRepository<AppoinmentEntity, Integer>{
	
	
	
	List<AppoinmentEntity> findBydoctorId(Integer doctorId);
	
	   AppoinmentEntity findByPatientId(Integer patientId);
	
	   
	   @Query(value = "SELECT a.appoinment_id as appoinmentId, a.patient_id as patientId, " +
		        "p.first_name as firstName, a.appoinment_status_id as appoinmentStatusId, " +
		        "d.first_name as firstName1, d.last_Name as lastName, " +
		        "a.appoinment_date as appoinmentDate, a.created_date as createdDate, r.name " +
		        "FROM patient p, appoinment a, doctor d, ratelist r " +
		        "WHERE p.patient_id = a.patient_id AND d.doctor_id = a.doctor_id " +
		        "AND r.ratelist_id = a.ratelist_id AND DAYOFMONTH(a.appoinment_date) = :DayOfMonth",
		        nativeQuery = true)
	
	     List<Appoinmentdto> findByappoinmenttoday(Integer DayOfMonth);
 
 
// @Query(value = "SELECT d.first_name, a.* FROM appoinment a JOIN doctor d ON d.doctor_id = a.doctor_id  where patient_id=:patientId", nativeQuery = true)
	
 @Query(value = "SELECT a.appoinment_id as appoinmentId ,  p.first_name as firstName, a.appoinment_status_id as appoinmentStatusId, " +
	        "d.first_name as firstName1, d.last_Name as lastName , a.appoinment_date as appoinmentDate, a.created_date as createdDate, " +
	        "r.name " +
	        "FROM patient p, appoinment a, doctor d, ratelist r " +
	        "WHERE p.patient_id = :patientId AND d.doctor_id = a.doctor_id AND r.ratelist_id = a.ratelist_id",  nativeQuery = true)
	 List<Appoinmentdto> findBypatientId(Integer patientId);
 
 
 
 
 @Query(value = "SELECT a.appoinment_id as appoinmentId ,a.patient_id as patientId ,  p.first_name as firstName, a.appoinment_status_id as appoinmentStatusId, " +
	        "d.first_name as firstName1, d.last_Name as lastName , a.appoinment_date as appoinmentDate, a.created_date as createdDate, " +
	        "r.name " +
	        "FROM patient p, appoinment a, doctor d, ratelist r " +
	        "WHERE p.patient_id = a.patient_id AND d.doctor_id = a.doctor_id AND r.ratelist_id = a.ratelist_id",  nativeQuery = true)
	   List<Appoinmentdto> findByAll();
 
 
 
 
 
 
 @Query(value = "SELECT a.appoinment_id as appoinmentId ,a.patient_id as patientId ,  p.first_name as firstName, a.appoinment_status_id as appoinmentStatusId, " +
	        "d.first_name as firstName1, d.last_Name as lastName , a.appoinment_date as appoinmentDate, a.created_date as createdDate, " +
	        "r.name " +
	        "FROM patient p, appoinment a, doctor d, ratelist r " +
	        "WHERE p.patient_id = a.patient_id AND d.doctor_id = :doctorId AND r.ratelist_id = a.ratelist_id",  nativeQuery = true)
	 List<Appoinmentdto> findByDoctorId(Integer doctorId);

 
 
 
 
 
 @Query(value = "SELECT a.appoinment_id as appoinmentId ,a.patient_id as patientId ,  p.first_name as firstName, a.appoinment_status_id as appoinmentStatusId, " +
	        "d.first_name as firstName1, d.last_Name as lastName , a.appoinment_date as appoinmentDate, a.created_date as createdDate, " +
	        "r.name " +
	        "FROM patient p, appoinment a, doctor d, ratelist r " +
	        "WHERE p.patient_id = a.patient_id AND d.doctor_id = a.doctor_id AND r.ratelist_id = a.ratelist_id AND DATE(appoinment_date)=:appoinmentDate",  nativeQuery = true)
	 List<Appoinmentdto> Appoinmentdatewisepatient(String appoinmentDate);

 
 
 
 @Query(value = "SELECT a.appoinment_id as appoinmentId, a.patient_id as patientId, " +
	        "p.first_name as firstName, a.appoinment_status_id as appoinmentStatusId, " +
	        "d.first_name as firstName1, d.last_Name as lastName, " +
	        "a.appoinment_date as appoinmentDate, a.created_date as createdDate, r.name " +
	        "FROM patient p, appoinment a, doctor d, ratelist r " +
	        "WHERE p.patient_id = a.patient_id AND d.doctor_id = :doctorId " +
	        "AND r.ratelist_id = a.ratelist_id AND DAYOFMONTH(a.appoinment_date) = :dayOfMonth",
	        nativeQuery = true)
	List<Appoinmentdto> getCurrentDayAppointmentByDoctor(Integer dayOfMonth, Integer doctorId);
 
 
 @Query(value = "SELECT a.appoinment_id as appoinmentId, a.patient_id as patientId, " +
	        "p.first_name as firstName, a.appoinment_status_id as appoinmentStatusId, " +
	        "d.first_name as firstName1, d.last_Name as lastName, " +
	        "a.appoinment_date as appoinmentDate, a.created_date as createdDate, r.name " +
	        "FROM patient p, appoinment a, doctor d, ratelist r " +
	        "WHERE p.patient_id = a.patient_id AND d.doctor_id = :doctorId " +
	        "AND r.ratelist_id = a.ratelist_id AND month(a.appoinment_date) = :month",
	        nativeQuery = true)
	List<Appoinmentdto> getCurrentMonthAppointmentByDoctor(Integer month, Integer doctorId);

 
 
 
 
 
 
// @Query(value=" select * from appoinment where DATE(appoinment_date)=:appoinmentDate",nativeQuery = true)
//      List<AppoinmentEntity> Appoinmentdatewisepatient(String appoinmentDate);
 
 
// @Query(value = "SELECT * FROM appoinment where DayofMonth(appoinment_date) = :dayOfMonth AND doctor_id = :doctorId", nativeQuery = true)
// List<AppoinmentEntity> getCurrentDayAppointmentByDoctor(Integer dayOfMonth, Integer doctorId);

 
 @Query(value = "SELECT a.appoinment_id as appoinmentId, a.patient_id as patientId, " +
	        "p.first_name as firstName, a.appoinment_status_id as appoinmentStatusId, " +
	        "d.first_name as firstName1, d.last_Name as lastName, " +
	        "a.appoinment_date as appoinmentDate, a.created_date as createdDate, r.name " +
	        "FROM patient p, appoinment a, doctor d, ratelist r " +
	        "WHERE p.patient_id = a.patient_id AND d.doctor_id = a.doctor_id " +
	        "AND r.ratelist_id = a.ratelist_id AND month(a.appoinment_date) = :month",
	        nativeQuery = true)
	
       List<Appoinmentdto> getCurruntMonthAppointPatient(Integer month);
 
 
 
 
 @Query(value = "select count(appoinment_id) from appoinment where month(appoinment_date) =:month",nativeQuery=true)
         Integer getCurruntMonthAppoinmentBypatientId(Integer month);
 
 /*@Query(value = "select count(appoinment_id) from appoinment where year(appoinment_date) = :year",nativeQuery=true)
 Integer getCurruntyearAppoinment(Integer year);*/
 
 @Query(value = "select count(appoinment_id) from appoinment where DayOfMonth(appoinment_date) =:DayOfMonth",nativeQuery=true)
 Integer getCurruntdayAppoinment(Integer DayOfMonth ); 
 
 
 
 @Query(value = "SELECT appoinment_id  , appoinment_date, appoinment_status_id , created_date , doctor_id , employee_id , patient_id , ratelist_id , DATE_FORMAT( appoinment_date, '%Y-%m') AS month,"
 		+ "       COUNT(*) AS  appointmentCount \r\n"
 		+ "FROM appoinment\r\n"
 		+ "GROUP BY DATE_FORMAT(appoinment_date, '%Y-%m')\r\n"
 		+ "ORDER BY month;",nativeQuery = true)
 
    List<AppoinmentEntity> findByAppoinments();
 

        
 
	

}
