package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "iteams")
public class IteamEntity {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer itemId;
	    private String materialgName;
	    private Integer materialId;
	    private String itemCode;
	    private String itemName;
	    private String alternateName;
	    private String shortName;
	    private float gstRate;
	    private String hsnCode;
	    private double price;
	    private String expiredDate;
	     
	     
		public Integer getItemId() {
			return itemId;
		}
		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}
		public String getMaterialgName() {
			return materialgName;
		}
		public void setMaterialgName(String materialgName) {
			this.materialgName = materialgName;
		}
		public Integer getMaterialId() {
			return materialId;
		}
		public void setMaterialId(Integer materialId) {
			this.materialId = materialId;
		}
		public String getItemCode() {
			return itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getAlternateName() {
			return alternateName;
		}
		public void setAlternateName(String alternateName) {
			this.alternateName = alternateName;
		}
		public String getShortName() {
			return shortName;
		}
		public void setShortName(String shortName) {
			this.shortName = shortName;
		}
		public float getGstRate() {
			return gstRate;
		}
		public void setGstRate(float gstRate) {
			this.gstRate = gstRate;
		}
		
		public String getHsnCode() {
			return hsnCode;
		}
		public void setHsnCode(String hsnCode) {
			this.hsnCode = hsnCode;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getExpiredDate() {
			return expiredDate;
		}
		public void setExpiredDate(String expiredDate) {
			this.expiredDate = expiredDate;
		}
	    
	    
	    
	    
	    

		

		

	    
	    

	    

}
