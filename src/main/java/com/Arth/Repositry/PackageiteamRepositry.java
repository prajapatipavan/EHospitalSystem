package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.PackageIteamEntity;

@Repository
public interface PackageiteamRepositry extends JpaRepository<PackageIteamEntity, Integer> {

}
