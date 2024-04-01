package com.Arth.dto;

public interface paymentsdto {
	
	
//	p.first_name , 
//	r.name , pa.actual_amount ,
//	pa.amount , pa.date, pa.discount,
//	pa.payment_status, pa.paymet_type,
//	
//	pa.reason_discount
	
	
	Integer getPaymentId();
	String getFirstName();
	String getName();
	double getActualAmount();
	float getAmount();
	String getDate();
   Integer getDiscount();
   String getPaymentStatus();
   String getPaymetType();
   String  getReasonDiscount();
	

}
