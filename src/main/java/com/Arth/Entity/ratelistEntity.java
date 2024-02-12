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
    private Integer ratelistId;
    private String name;
    private float amount;
    private Integer ratetypeId;
    private Integer departmentid;
 
 
	public Integer getRatelistId() {
		return ratelistId;
	}

	


	public void setRatelistId(Integer ratelistId) {
		this.ratelistId = ratelistId;
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



	public Integer getRatetypeId() {
		return ratetypeId;
	}



	public void setRatetypeId(Integer ratetypeId) {
		this.ratetypeId = ratetypeId;
	}



	public Integer getDepartmentid() {
		return departmentid;
	}



	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}





   
    
    


}
