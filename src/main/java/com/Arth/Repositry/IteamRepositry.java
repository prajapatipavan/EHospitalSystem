package com.Arth.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.IteamEntity;

@Repository
public interface IteamRepositry extends JpaRepository<IteamEntity,Integer> {

}
