package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.PharmistEntity;
import com.Arth.Entity.clerkentity;

@Repository
public interface PharmacistRepositry extends JpaRepository<PharmistEntity, Integer>  {
	
	clerkentity findByEmailAndPassword(String email,String password);
	   
	  PharmistEntity findByEmail(String email);

}
