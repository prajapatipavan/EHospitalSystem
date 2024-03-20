package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.PrescriptionEntity;

@Repository
public interface PrescriptionRepositry extends JpaRepository<PrescriptionEntity,Integer> {
	
	
	            
	 @Query(value = "SELECT * FROM prescription WHERE patient_id = :patientId", nativeQuery = true)
	    List<PrescriptionEntity> findByPatientIdtoprecription(Integer patientId);
	              
	              
	      

}
