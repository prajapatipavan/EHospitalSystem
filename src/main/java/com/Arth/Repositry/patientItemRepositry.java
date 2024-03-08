package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.patientItemEntity;

@Repository
public interface patientItemRepositry extends JpaRepository<patientItemEntity, Integer> {

}
