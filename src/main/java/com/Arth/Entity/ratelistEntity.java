package com.Arth.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ratelist")
public class ratelistEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ratelistid;
    private String name;
    private float amount;
    private Integer rateType;
    private String department;




	public Integer getRatelistid() {
		return ratelistid;
	}



	public void setRatelistid(Integer ratelistid) {
		this.ratelistid = ratelistid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getAmount() {
		return amount;
	}



	public void setAmount(float amount) {
		this.amount = amount;
	}



	public Integer getRateType() {
		return rateType;
	}



	public void setRateType(Integer rateType) {
		this.rateType = rateType;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}

   
    
    


}
