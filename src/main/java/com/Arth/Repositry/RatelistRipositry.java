package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.ratelistEntity;
import com.Arth.dto.ratelistdto;

@Repository
public interface RatelistRipositry extends JpaRepository<ratelistEntity, Integer> {
	
	
	@Query(value = " select DISTINCT r.name , ra.type ,r.amount , "
			+ "r.ratelist_id as ratelistId"
			+ " from ratelist r ,ratetype ra "
			+ "where ra.ratetype_i=r.ratetype_id ;",nativeQuery = true)
	
	 List<ratelistdto> FindByratelistId();

}
