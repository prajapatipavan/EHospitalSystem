package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pharmacist")
public class PharmistEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer  pharmacistId;
	 private String   pharmacistName;
	 private String   email;
	 private String  password;
	 private Integer roleId ;
	 private String  mobileNo;
	 private String dateOfBirth;
	 private Integer otp ;
	  
	 
	public Integer getPharmacistId() {
		return pharmacistId;
	}
	public void setPharmacistId(Integer pharmacistId) {
		this.pharmacistId = pharmacistId;
	}
	public String getPharmacistName() {
		return pharmacistName;
	}
	public void setPharmacistName(String pharmacistName) {
		this.pharmacistName = pharmacistName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getOtp() {
		return otp;
	}
	public void setOtp(Integer otp) {
		this.otp = otp;
	}
	 
	 
	 
	 

}
