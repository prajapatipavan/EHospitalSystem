package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.packageEntity;
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
	
	@PostMapping("/savepatient")
   public String home(patientEntity patient) {
		
	  	rpatient.save(patient);
		 
		return "redirect:/patientlist";
	}
	
	
	@GetMapping("/patientlist")
	public String patientlist(Model model) {
		List<patientEntity> patient = rpatient.findAll();
		 model.addAttribute("patient",patient);
		
		return "/patientlist";
	}
}
