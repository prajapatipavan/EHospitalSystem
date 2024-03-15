package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.patientEntity;

@Repository
public interface patientrepositry extends JpaRepository<patientEntity, Integer> {
	
	   patientEntity findByEmailAndPassword(String email , String password);
	   
	  patientEntity findByEmail(String email);
	  
	

}
