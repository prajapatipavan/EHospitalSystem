package com.Arth.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.packageEntity;
import com.Arth.dto.packagedto;

@Repository
public interface PackageRepositry extends JpaRepository<packageEntity, Integer> {
	
	@Query(value = "select r.type , p.package_id as packageId, p.amount "
			+ ",p.name,p.package_type as packageType "
			+ " from package p , ratetype r "
			+ "where p.ratetype_id = r.ratetype_id;",nativeQuery = true)
	
	
	List<packagedto> findbyallpacakege();

}
