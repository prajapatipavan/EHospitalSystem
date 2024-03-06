package com.Arth.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.PaymentsEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Entity.ratelistEntity;
import com.Arth.Repositry.PaymentsRepositry;
import com.Arth.Repositry.RatelistRipositry;
import com.Arth.Repositry.patientrepositry;



@Controller
public class PaymentsController {
	
	@Autowired
	patientrepositry patientrepo;
	
	@Autowired
	RatelistRipositry ratelistRipo;
	
	@Autowired
	PaymentsRepositry paymentsRepo;
	
	@GetMapping("payments")
	public String Payments(patientEntity pEntity,Model model,@RequestParam("id") Integer patientId) {
		
		       patientEntity patients     =  patientrepo.findById(patientId).get();
		       
		       model.addAttribute("patients",patients);
		       
		       
		       
		       List<ratelistEntity> ratelistEntity = ratelistRipo.findAll() ;  
		   	
		 	  model.addAttribute("ratelist",ratelistEntity);
		      
		      
		
		return "Payments";
	}
	
	@PostMapping("processPayment")
	public String processPayment(PaymentsEntity pentity ,@RequestParam("id") Integer patientId ,Model model ) {
		
		 patientEntity patients = patientrepo.findById(patientId).get();
	       
	       model.addAttribute("patients",patients);
	       
	       
          PaymentsEntity dates = paymentsRepo.findByDate(pentity.getDate());
	       
	       model.addAttribute("dates",dates); 
	       
	       pentity.setPaymentStatus("paid");
		
		paymentsRepo.save(pentity);
		
		return "processPayment";
	}
	
	

}
