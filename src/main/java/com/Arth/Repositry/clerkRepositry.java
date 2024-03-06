package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.clerkentity;
import com.Arth.Entity.patientEntity;

@Repository
public interface clerkRepositry extends JpaRepository<clerkentity,Integer>{
	
	clerkentity findByEmailAndPassword(String email , String password);
	   
	  clerkentity findByEmail(String email);

}
