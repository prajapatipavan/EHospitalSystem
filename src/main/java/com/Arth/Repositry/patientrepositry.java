package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.patientEntity;

@Repository
public interface patientrepositry extends JpaRepository<patientEntity, Integer> {

}
