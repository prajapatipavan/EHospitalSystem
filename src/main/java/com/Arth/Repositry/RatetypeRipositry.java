package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.Ratetype;

@Repository
public interface RatetypeRipositry  extends JpaRepository<Ratetype, Integer>{

}
