package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;


import com.Arth.Entity.IteamEntity;

@Repository
public interface IteamRepositry extends JpaRepository<IteamEntity,Integer> {
	
	
	 @Query(value = "select count(item_id) from iteams where month(expired_date)= :month+1;",nativeQuery=true)
        Integer getCurruntMonthexpireiteams(Integer month);

	
	 
	
	@Query(value = "select * from iteams where month(expired_date) = :month+1;",nativeQuery=true)
	
	 List<IteamEntity> getupcommingMonthitems(Integer month);

}
