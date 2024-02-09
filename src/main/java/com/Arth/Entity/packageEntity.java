package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "package")
public class packageEntity {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer packageId;
    private String name;
    private Integer amount;
    private Integer  ratetypeId;
    private String packageType;
    
	
	
	public Integer getPackageId() {
		return packageId;
	}
	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Integer getRatetypeId() {
		return ratetypeId;
	}
	public void setRatetypeId(Integer ratetypeId) {
		this.ratetypeId = ratetypeId;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
    
    
    

}
