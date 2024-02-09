package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.AppointmentStatusEntity;

@Repository
public interface AppoinmentStatusRepositry extends JpaRepository<AppointmentStatusEntity, Integer> {

}
