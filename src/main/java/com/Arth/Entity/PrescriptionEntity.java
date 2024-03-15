package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Prescription")
public class PrescriptionEntity {
	
	
	     @Id
	     @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer prescriptionId;
	    private Integer patientId;
	    private String medicine;
	    private String dosage;
	    private String instructions;
	   
	     
	    
		public Integer getPrescriptionId() {
			return prescriptionId;
		}
		public void setPrescriptionId(Integer prescriptionId) {
			this.prescriptionId = prescriptionId;
		}
		
		
		public Integer getPatientId() {
			return patientId;
		}
		public void setPatientId(Integer patientId) {
			this.patientId = patientId;
		}
		public String getMedicine() {
			return medicine;
		}
		public void setMedicine(String medicine) {
			this.medicine = medicine;
		}
		public String getDosage() {
			return dosage;
		}
		public void setDosage(String dosage) {
			this.dosage = dosage;
		}
		public String getInstructions() {
			return instructions;
		}
		public void setInstructions(String instructions) {
			this.instructions = instructions;
		}
	    
	    
	    

}
