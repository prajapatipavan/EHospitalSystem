package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "docdocument")
public class DoctorDocumentsEntity {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer doctorDocumentsId;
	    private String documentName;
	    private Integer doctorId;
 
	    private String documentPath;
	    
	    

		

		public Integer getDoctorDocumentsId() {
			return doctorDocumentsId;
		}

		public void setDoctorDocumentsId(Integer doctorDocumentsId) {
			this.doctorDocumentsId = doctorDocumentsId;
		}

		public String getDocumentName() {
			return documentName;
		}

		public void setDocumentName(String documentName) {
			this.documentName = documentName;
		}

		

		

		public Integer getDoctorId() {
			return doctorId;
		}

		public void setDoctorId(Integer doctorId) {
			this.doctorId = doctorId;
		}

		public String getDocumentPath() {
			return documentPath;
		}

		public void setDocumentPath(String documentPath) {
			this.documentPath = documentPath;
		}
	    
	    
	    
	    

}
