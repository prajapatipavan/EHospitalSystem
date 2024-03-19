package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.Arth.Entity.patientItemEntity;

@Repository
public interface patientItemRepositry extends JpaRepository<patientItemEntity, Integer> {
	
	 @Query(value = "SELECT * FROM patient_item WHERE patient_id = :patientId", nativeQuery = true)
	    List<patientItemEntity> findByPatientId(Integer patientId);
	
	     
	   
	
	

}
