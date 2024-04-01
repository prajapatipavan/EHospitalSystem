package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.PrescriptionEntity;
import com.Arth.dto.prescriptiondto;

@Repository
public interface PrescriptionRepositry extends JpaRepository<PrescriptionEntity,Integer> {
	
	
	            
	 @Query(value = "SELECT * FROM prescription WHERE patient_id = :patientId", nativeQuery = true)
	    List<PrescriptionEntity> findByPatientIdtoprecription(Integer patientId);
	 
	 
	 
	 @Query(value = "select   pa.first_name as firstName ,pa.last_name as LastName ,p. medicine ,p.instructions  from  prescription p ,patient pa where  pa.patient_id =:patientId", nativeQuery = true)
	    List<prescriptiondto> findByPatientIdtoprecriptiondto(Integer patientId);
	              
	              
	    
	    @Query(value = "select p.prescription_id as prescriptionId ,  pa.first_name as firstName ,pa.last_name as LastName ,p. medicine ,p.instructions  from  prescription p ,patient pa where  pa.patient_id = p.patient_id", nativeQuery = true)
	    List<prescriptiondto> findByAllPatientIdtoprecriptiondto();
	              
	      

}
