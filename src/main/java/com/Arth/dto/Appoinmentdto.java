package com.Arth.dto;

import java.time.LocalDate;

public interface Appoinmentdto {
	
	
//	first_name,
//	appoinment_status_id,
//	first_name,
//	appoinment_date,
//	created_date,
//	name
	
	Integer getAppoinmentId();
	Integer getPatientId();
	String getFirstName();
	String getLastName();
	Integer getAppoinmentStatusId();
	String getFirstName1();
	String getAppoinmentDate();
	LocalDate getCreatedDate();
	String getName();
	


}
