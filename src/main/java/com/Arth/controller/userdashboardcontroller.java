package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.AppoinmentRepositry;

import jakarta.servlet.http.HttpSession;

@Controller
public class userdashboardcontroller {
	
	@Autowired
	AppoinmentRepositry aRepositry;
	
	
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
		
		return "/Appoinmentlist";
	}
	
	
	
	


}
