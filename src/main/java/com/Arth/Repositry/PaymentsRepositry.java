package com.Arth.Repositry;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Arth.Entity.PaymentsEntity;
import com.Arth.dto.paymentsdto;


@Repository
public interface PaymentsRepositry extends JpaRepository<PaymentsEntity, Integer> {

	PaymentsEntity findByDate(String date);
	
	
	@Query(value = " select  DISTINCT pa.payment_id as paymentId, p.first_name as firstName , r.name as Name , "
			+ "pa.actual_amount as actualAmount  "
			+ ", pa.amount  ,"
			+ " pa.date, pa.discount,pa.payment_status as paymentStatus, pa.paymet_type as paymetType"
			+ ",pa.reason_discount as reasonDiscount"
			+ " from patient p , payments pa , ratelist r "
			+ "where p.patient_id=pa.patient_id AND pa. ratelist_id=r.ratelist_id",nativeQuery = true)
	
	      List<paymentsdto> findByAllPayemnts();
	
	        
	

}
