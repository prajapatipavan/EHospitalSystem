package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.DepartmentEntity;

@Repository
public interface DepartmentRepositry  extends JpaRepository<DepartmentEntity, Integer>{

}
