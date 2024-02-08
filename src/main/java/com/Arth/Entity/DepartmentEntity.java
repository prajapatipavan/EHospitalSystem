package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class DepartmentEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Integer depid;
    private String name;
    private boolean active;
    
    
	
	public Integer getDepid() {
		return depid;
	}
	public void setDepid(Integer depid) {
		this.depid = depid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
    
    
    

}
