package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class patientEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer patientid;
	 private String firstname;
	 private String middlename;
	 private String lastname;
	 private String email;
	 private String password;
	 private String gender;
	 private String dateOfBirth;
	 private String contactNum;
	 private String bloodgrp;
	 private String address;
	 private String refferdBy;
	 private String country;
	 private String city;
	 private String state;
	 private String pincode;
	 private String Diseases;
	 private String diabeties;
	 private String Registrationtype;
	 private String docType;
	 private Integer role;
	 
	 
	 
	public Integer getUserid() {
		return patientid;
	}
	public void setUserid(Integer userid) {
		this.patientid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Integer getPatientid() {
		return patientid;
	}
	public void setPatientid(Integer patientid) {
		this.patientid = patientid;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBloodgrp() {
		return bloodgrp;
	}
	public void setBloodgrp(String bloodgrp) {
		this.bloodgrp = bloodgrp;
	}
	public String getRefferdBy() {
		return refferdBy;
	}
	public void setRefferdBy(String refferdBy) {
		this.refferdBy = refferdBy;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getDiseases() {
		return Diseases;
	}
	public void setDiseases(String diseases) {
		Diseases = diseases;
	}
	public String getDiabeties() {
		return diabeties;
	}
	public void setDiabeties(String diabeties) {
		this.diabeties = diabeties;
	}
	public String getRegistrationtype() {
		return Registrationtype;
	}
	public void setRegistrationtype(String registrationtype) {
		Registrationtype = registrationtype;
	}
	public String getDocType(){
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	 

}
