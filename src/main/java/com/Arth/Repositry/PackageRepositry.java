package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.packageEntity;

@Repository
public interface PackageRepositry extends JpaRepository<packageEntity, Integer> {

}
