package com.Arth.controller;

import java.awt.Paint;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.packageEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.patientrepositry;
import com.Arth.service.Weicomemailsend;

@Controller
public class patientController {
	
	@Autowired
	
	patientrepositry rpatient;
	
	@Autowired
	BCryptPasswordEncoder bCryptpass;
	
	@Autowired
	Weicomemailsend welcomemail;
	
	@GetMapping("patientprofile")
	public String patientprofile() {
		
		return "patient";
	}
	
	@PostMapping("/savepatient")
   public String home(patientEntity patient,Model model) {
		
		
		patient.setRoleId(5);
		
		if(! patient.getPassword().equals(patient.getComfirmPassword())) {
			model.addAttribute("passerror","*password and Confirm password not same");
			return "patient";
		}
		
		String plaintext = patient.getPassword();
		
		String encryptpassword = bCryptpass.encode(plaintext);
		
		patient.setPassword(encryptpassword);
		
		
		
		welcomemail.welcomeMailSend(patient.getEmail(),patient.getFirstName());
		
	  	rpatient.save(patient);
	  	
	  	
	  	
		   return "login";
	}
	
	
	@GetMapping("/patientlist")
	public String patientlist(Model model) {
		List<patientEntity> patient = rpatient.findAll();
		 model.addAttribute("patient",patient);
		
		return "/patientlist";
	}
	
	@GetMapping("/deletepatient")
	public String deletepatient(@RequestParam("id") Integer patientId) {
		
		rpatient.deleteById(patientId);
		return "redirect:/patientlist";
	}
}
