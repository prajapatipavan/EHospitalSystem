package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.AppoinmentEntity;

import com.Arth.Repositry.AppoinmentRepositry;


@Controller
public class AppoinmentController {
	
	@Autowired
	AppoinmentRepositry repositry;
	
	@GetMapping("/appoinment")
	public String department() {
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

}
