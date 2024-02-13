package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "packagerate")
public class PackageRateListEntity {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer packagerateId;
		
	    private Integer packageId;
	    private Integer ratelistId;
	     
	    
	     
	    
		public Integer getPackagerateId() {
			return packagerateId;
		}
		public void setPackagerateId(Integer packagerateId) {
			this.packagerateId = packagerateId;
		}
		public Integer getPackageId() {
			return packageId;
		}
		public void setPackageId(Integer packageId) {
			this.packageId = packageId;
		}
		public Integer getRatelistId() {
			return ratelistId;
		}
		public void setRatelistId(Integer ratelistId) {
			this.ratelistId = ratelistId;
		}
	    
	    
		
	    
	    
	      		

}
