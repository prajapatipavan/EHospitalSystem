package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="packageiteam")
public class PackageIteamEntity {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer packageiteamId;
     private Integer packageId; 
     private Integer itemId;
    
     
    

	public Integer getPackageiteamId() {
		return packageiteamId;
	}

	public void setPackageiteamId(Integer packageiteamId) {
		this.packageiteamId = packageiteamId;
	}

	public Integer getPackageId() {
		return packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
    


	

     
    
	
	
	

}
