package com.Arth.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AppoinmentStatus")
public class AppointmentStatusEntity {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
        private Integer appoinmentStatusId;
	
	    private String statusName;

		public String getStatusName() {
			return statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public Integer getAppoinmentStatusId() {
			return appoinmentStatusId;
		}

		public void setAppoinmentStatusId(Integer appoinmentStatusId) {
			this.appoinmentStatusId = appoinmentStatusId;
		}

		
		
		
		
	    
	    

}
