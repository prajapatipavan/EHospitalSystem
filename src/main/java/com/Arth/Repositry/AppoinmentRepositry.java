package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.AppoinmentEntity;

@Repository
public interface AppoinmentRepositry  extends JpaRepository<AppoinmentEntity, Integer>{

}
