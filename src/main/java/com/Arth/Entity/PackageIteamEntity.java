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
	 private Integer packageIteamId;
     private Integer packageId; 
     private Integer itemId;
    
        

	public Integer getPackageIteamId() {
		return packageIteamId;
	}

	public void setPackageIteamId(Integer packageIteamId) {
		this.packageIteamId = packageIteamId;
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
