package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;


import com.Arth.Entity.IteamEntity;
import com.Arth.dto.iteamdto;

@Repository
public interface IteamRepositry extends JpaRepository<IteamEntity,Integer> {
	
	
	 @Query(value = "select count(item_id) from iteams where month(expired_date)= :month+1;",nativeQuery=true)
        Integer getCurruntMonthexpireiteams(Integer month);

	
	 
	

	
	
	@Query(value = "select m.material_name  as  materialName , i.item_id as itemId, i.alternate_name as  alternateName ,"
			+ " i.expired_date as expiredDate , i.gst_rate as gstRate , i.hsn_code as hsnCode , "
			   + "i.item_code  as itemCode ,"
				+ " i.item_name as itemName ,i.materialg_name  as materialgName  ,i.price  , i.short_name  as shortName "
				+ "from material m ,"
				+ "iteams i where m.material_id = i.material_id AND month(expired_date) = :month+1;",nativeQuery=true)
	
	      List<iteamdto> getupcommingMonthitems(Integer month);

	
	
	
	
@Query(value = "select m.material_name  as  materialName , i.item_id as itemId, i.alternate_name as  alternateName ,"
		+ " i.expired_date as expiredDate , i.gst_rate as gstRate , i.hsn_code as hsnCode , "
		   + "i.item_code  as itemCode ,"
			+ " i.item_name as itemName ,i.materialg_name  as materialgName  ,i.price  , i.short_name  as shortName "
			+ "from material m ,"
			+ "iteams i where m.material_id = i.material_id;",nativeQuery=true)
	
	 List<iteamdto> findByAllitem();
}
