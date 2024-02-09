package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.ServiceTypeEntity;

@Repository
public interface ServiceTypeRepositry  extends JpaRepository<ServiceTypeEntity, Integer>{
	
	

}
