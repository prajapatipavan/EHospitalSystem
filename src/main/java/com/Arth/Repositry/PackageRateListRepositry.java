package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.EmployeeEntity;
import com.Arth.Entity.PackageRateListEntity;

@Repository
public interface PackageRateListRepositry  extends JpaRepository<PackageRateListEntity, Integer>{

}
