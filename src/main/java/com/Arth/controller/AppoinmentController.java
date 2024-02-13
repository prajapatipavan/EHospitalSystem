package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.DoctorEntity;
import com.Arth.Entity.EmployeeEntity;
import com.Arth.Entity.Ratetype;
import com.Arth.Entity.patientEntity;
import com.Arth.Entity.ratelistEntity;
import com.Arth.Repositry.AppoinmentRepositry;
import com.Arth.Repositry.DoctorRepositry;
import com.Arth.Repositry.EmployeeRepositry;
import com.Arth.Repositry.RatelistRipositry;
import com.Arth.Repositry.patientrepositry;


@Controller
public class AppoinmentController {
	
	@Autowired
	AppoinmentRepositry repositry;
	
	
	@Autowired
	DoctorRepositry dRepositry;
	
	
	@Autowired
	patientrepositry patientrepositry;
	
	
	@Autowired
	RatelistRipositry ratelistRipositry;
	
	
	@Autowired
	EmployeeRepositry eRepositry;
	
	
	@GetMapping("/appoinment")
	public String department(Model model) {
		
		List<DoctorEntity> dname	= dRepositry.findAll();
		model.addAttribute("dname",dname);
		
		
		
		List<patientEntity> pname	= patientrepositry.findAll();
		model.addAttribute("pname",pname);
		
		
		
		List<ratelistEntity> ratelistname	= ratelistRipositry.findAll();
		model.addAttribute("ratelistname",ratelistname);
		
		
		List<EmployeeEntity> eName	= eRepositry.findAll();
		model.addAttribute("eName",eName);
		
		return "/Appoinment";
	}
	
	@PostMapping("/saveappointment")
	public String saveappointment(AppoinmentEntity appoinment) {
		repositry.save(appoinment);
		return "redirect:/Appoinmentlist";
	}
	

	@GetMapping("/Appoinmentlist")
	public String departmentlist(Model model) {
		List<AppoinmentEntity> appoinment = repositry.findAll();
		 model.addAttribute("appoinment",appoinment);
		
		return "/Appoinmentlist";
	}
	
	@GetMapping("/deleteAppoinment")
	public String deleteAppoinment(@RequestParam("id") Integer appoinmentId) {
		
		   repositry.deleteById(appoinmentId);
		
		return "/Appoinmentlist";
	}

}
