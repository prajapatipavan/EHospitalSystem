package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.AdminnEntity;
import com.Arth.Entity.patientEntity;

@Repository
public interface AdminRepositry extends JpaRepository<AdminnEntity,Integer> {
	

	  
	   
	  AdminnEntity findByEmail(String email);

}
