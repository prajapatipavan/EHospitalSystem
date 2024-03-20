package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.PrescriptionEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.AppoinmentRepositry;
import com.Arth.Repositry.PrescriptionRepositry;
import com.Arth.Repositry.patientrepositry;

import jakarta.servlet.http.HttpSession;

@Controller
public class userdashboardcontroller {
	
	@Autowired
	AppoinmentRepositry aRepositry;
	
	@Autowired
	PrescriptionRepositry repositry;
	
	@Autowired
	patientrepositry patientRepo;
	
	@GetMapping("userdashboard")
	public String userdashboard() {
		return "userdashboard";
	}
	
	@GetMapping("patientAppoinmentlist")
	public String patientAppoinmentlist(Model model, HttpSession session) {
		
		
     patientEntity patient  = (patientEntity)session.getAttribute("user"); 
		
		List<AppoinmentEntity> appoinments = aRepositry.findBypatientId(patient.getPatientId());
		
		model.addAttribute("appoinment",appoinments);

		
		return "patientAppoinmentlist";
	}
	
	@GetMapping("/deleteuserAppoinment")
	public String deleteAppoinment(@RequestParam("id") Integer appoinmentId) {
		
		  aRepositry.deleteById(appoinmentId);
		
		return "redirect:/patientAppoinmentlist";
	}
	
	
	@GetMapping("patientprescriptionlist")
	public String patientprescriptionlist(HttpSession session,Model model) {
		
		
		   patientEntity patient  = (patientEntity)session.getAttribute("user"); 
			
			List<PrescriptionEntity> prescription = repositry.findByPatientIdtoprecription(patient.getPatientId());
			
			model.addAttribute("prescription",prescription );
		
		
		
		return "patientprescriptionlist";
	}
	
	
	@GetMapping("patientprofiles")
	public String patientprofile(@RequestParam("id") Integer patientId,Model model) {
		
	    patientEntity	patiente =  patientRepo.findById(patientId).get();    
	    model.addAttribute("patiente",patiente);
		
		return "patientprofile";
	}
	
	


}
