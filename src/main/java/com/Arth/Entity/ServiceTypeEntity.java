package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicetype")
public class ServiceTypeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serviceTypeId;
    private String type;
   
   

public Integer getServiceTypeId() {
	return serviceTypeId;
}
public void setServiceTypeId(Integer serviceTypeId) {
	this.serviceTypeId = serviceTypeId;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
   
   

}
