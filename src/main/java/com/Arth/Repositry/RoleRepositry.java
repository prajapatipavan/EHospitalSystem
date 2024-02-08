package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.Arth.Entity.RoleEntity;

@Repository
public interface RoleRepositry extends JpaRepository<RoleEntity, Integer>{

}
