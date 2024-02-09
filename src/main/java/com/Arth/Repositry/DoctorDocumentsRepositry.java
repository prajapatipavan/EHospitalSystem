package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.DoctorDocumentsEntity;

@Repository
public interface DoctorDocumentsRepositry extends JpaRepository<DoctorDocumentsEntity, Integer>{

}
