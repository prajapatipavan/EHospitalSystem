package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.DoctorEntity;

import com.Arth.Repositry.DoctorRepositry;

@Controller
public class Doctorcontroller {
	
	
	
	@Autowired
	DoctorRepositry repositry;
	
	@GetMapping("/doctorpage")
	public String department() {
		return "/doctor";
	}
	
	
	@PostMapping("/addDoctor")
	public String addDoctor(DoctorEntity doctor) {
		repositry.save(doctor);
		return "redirect:/doctorlist";
	}
	

	@GetMapping("/doctorlist")
	public String departmentlist(Model model) {
		List<DoctorEntity> doctor = repositry.findAll();
		 model.addAttribute("doctor",doctor);
		
		return "/doctorlist";
	}
	

}
