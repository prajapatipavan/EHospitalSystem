package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.Arth.Entity.patientItemEntity;
import com.Arth.dto.patientItemdto;

@Repository
public interface patientItemRepositry extends JpaRepository<patientItemEntity, Integer> {
	
	 @Query(value = "SELECT * FROM patient_item WHERE patient_id = :patientId", nativeQuery = true)
	    List<patientItemEntity> findByPatientId(Integer patientId);
	
	     
	   @Query(value = "select distinct patient_id from patient_item",nativeQuery = true)
	   
	      List<patientItemEntity> findByuniqpatientId();
	      
	      
	      @Query(value = " select  pi.patient_item_id  as patientitemId , i.materialg_name as materialgName , p.first_name as firstName , p.last_Name as lastName  ,"
	      		+ " pi.qty , pi.total_price as totalPrice ,pi.date "
	      		+ "from patient_item pi ,"
	      		+ "iteams i, patient p "
	      		+ "where pi.item_id=i.item_id AND pi.patient_id=p.patient_id ;",nativeQuery = true)
	      
	      List<patientItemdto> findByPatientItemlist();
	      
	
	

}
