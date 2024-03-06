package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class PaymentsEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Integer paymentId;
	    private Integer patientId;
	    private String patientName;
	    private float amount;
	    private String paymetType;
	    private Integer ratelistId;
	    private Integer discount;
	    private double actualAmount;
	    private String reasonDiscount;
	    private String date;
	    private String paymentStatus;
      
		public Integer getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(Integer paymentId) {
			this.paymentId = paymentId;
		}
		public Integer getPatientId() {
			return patientId;
		}
		public void setPatientId(Integer patientId) {
			this.patientId = patientId;
		}
		public float getAmount() {
			return amount;
		}
		public void setAmount(float amount) {
			this.amount = amount;
		}
		public Integer getRatelistId() {
			return ratelistId;
		}
		public void setRatelistId(Integer ratelistId) {
			this.ratelistId = ratelistId;
		}
		public Integer getDiscount() {
			return discount;
		}
		public void setDiscount(Integer discount) {
			this.discount = discount;
		}
		public double getActualAmount() {
			return actualAmount;
		}
		public void setActualAmount(double actualAmount) {
			this.actualAmount = actualAmount;
		}
		public String getReasonDiscount() {
			return reasonDiscount;
		}
		public void setReasonDiscount(String reasonDiscount) {
			this.reasonDiscount = reasonDiscount;
		}
		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public String getPaymetType() {
			return paymetType;
		}
		public void setPaymetType(String paymetType) {
			this.paymetType = paymetType;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getPaymentStatus() {
			return paymentStatus;
		}
		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}
	    
	      
	    
	    
	   
}
