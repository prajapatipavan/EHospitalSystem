package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepositry extends JpaRepository<EmployeeEntity,Integer> {

}
