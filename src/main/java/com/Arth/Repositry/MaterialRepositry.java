package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.MaterialEntity;

@Repository
public interface MaterialRepositry  extends JpaRepository<MaterialEntity, Integer>{

	
	
	
}
