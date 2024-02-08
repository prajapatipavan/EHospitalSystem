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
    private Integer pacid;
    private String name;
    private Integer amount;
    private Integer rateType;
    private String packageType;
    
	
	public Integer getPacid() {
		return pacid;
	}
	public void setPacid(Integer pacid) {
		this.pacid = pacid;
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
	public Integer getRateType() {
		return rateType;
	}
	public void setRateType(Integer rateType) {
		this.rateType = rateType;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
    
    
    

}
