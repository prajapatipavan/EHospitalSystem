package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clerks")
public class clerkentity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clerksId;
	private String clerkName;
	private String email;
	private String password;
	private String  mobileNo;
	private Integer roleId;
	private Integer otp;
	 
	public Integer getClerksId() {
		return clerksId;
	}
	public void setClerksId(Integer clerksId) {
		this.clerksId = clerksId;
	}
	public String getClerkName() {
		return clerkName;
	}
	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
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
	public Integer getOtp() {
		return otp;
	}
	public void setOtp(Integer otp) {
		this.otp = otp;
	}
	 
	
	 
	
	 

}
