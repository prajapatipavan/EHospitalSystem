package com.Arth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.patientrepositry;

@Controller
public class patientController {
	
	@Autowired
	
	patientrepositry rpatient;
	
	@GetMapping("patientprofile")
	public String patientprofile() {
		
		return "patient";
	}
	
	@PostMapping("/Home")
   public String home(patientEntity patient) {
		
	  	rpatient.save(patient);
		 
		return "welcome";
	}
}
