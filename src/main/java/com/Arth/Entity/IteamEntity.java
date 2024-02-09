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

	    
	    private Integer materialId;

	    private String MaterialGroupName;

	    private String itemCode;

	    private String itemName;

	    private String alternateName;

	    private String shortName;

	    private float gstRate;

	    private String HsnCode;

	    private double price;
	    
	    

		

		

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public Integer getMaterialId() {
			return materialId;
		}

		public void setMaterialId(Integer materialId) {
			this.materialId = materialId;
		}

		public String getMaterialGroupName() {
			return MaterialGroupName;
		}

		public void setMaterialGroupName(String materialGroupName) {
			MaterialGroupName = materialGroupName;
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
			return HsnCode;
		}

		public void setHsnCode(String hsnCode) {
			HsnCode = hsnCode;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
	    
	    
	    

	    

}
