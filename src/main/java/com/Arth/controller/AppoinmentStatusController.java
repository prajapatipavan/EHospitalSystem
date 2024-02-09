package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.AppointmentStatusEntity;
import com.Arth.Entity.DepartmentEntity;
import com.Arth.Repositry.AppoinmentStatusRepositry;
import com.Arth.Repositry.DepartmentRepositry;

@Controller
public class AppoinmentStatusController {
	
	@Autowired
	AppoinmentStatusRepositry repositry;
	
	@GetMapping("/appoimentstatus")
	public String appoimentstatus() {
		return "/AppoinmentStatus";
	}
	
	@PostMapping("/saveappoimentstatus")
	public String home(AppointmentStatusEntity department) {
		repositry.save(department);
		return "redirect:/AppoinmentStauslist";
	}
	

	@GetMapping("/AppoinmentStatuslist")
	public String departmentlist(Model model) {
		List<AppointmentStatusEntity> apstatus = repositry.findAll();
		 model.addAttribute("apstatus ",apstatus);
		
		return "/AppoinmentStauslist";
	}
	

}
