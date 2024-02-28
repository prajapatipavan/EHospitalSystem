package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.DoctorEntity;

@Repository
public interface DoctorRepositry extends JpaRepository<DoctorEntity, Integer> {
	
	
	DoctorEntity  findByEmail(String email);

}
