package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Appoinment")
public class AppoinmentEntity {
	
	  private Integer doctorId;
	  private Integer patientId;
	  private Integer ratelistId;
	  private String appoinmentDate;
	  private String createdDate;
	  private Integer employeeId;
	  private Integer appoinmentStatusId;
	  
	 
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	
	public Integer getRatelistId() {
		return ratelistId;
	}
	public void setRatelistId(Integer ratelistId) {
		this.ratelistId = ratelistId;
	}
	public String getAppoinmentDate() {
		return appoinmentDate;
	}
	public void setAppoinmentDate(String appoinmentDate) {
		this.appoinmentDate = appoinmentDate;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getAppoinmentStatusId() {
		return appoinmentStatusId;
	}
	public void setAppoinmentStatusId(Integer appoinmentStatusId) {
		this.appoinmentStatusId = appoinmentStatusId;
	}
	  
	  
	  
	 
	  
	
	

}
