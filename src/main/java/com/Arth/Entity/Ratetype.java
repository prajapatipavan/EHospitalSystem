package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ratetype")
public class Ratetype {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
      private Integer rateid;
      private String type;
      
      
	public Integer getRateid() {
		return rateid;
	}

	public void setRateid(Integer rateid) {
		this.rateid = rateid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
      
      

}
