package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.DepartmentEntity;
import com.Arth.Entity.EmployeeEntity;
import com.Arth.Repositry.DepartmentRepositry;
import com.Arth.Repositry.EmployeeRepositry;

public class EmployeeController {
	
	
	@Autowired
	EmployeeRepositry repositry;
	
	@GetMapping("/Employee")
	public String department() {
		return "/Employee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(EmployeeEntity employee) {
		repositry.save(employee);
		return "redirect:/employeelist";
	}
	

	@GetMapping("/employeelist")
	public String employeelist(Model model) {
		List<EmployeeEntity> employee = repositry.findAll();
		 model.addAttribute("employee",employee);
		
		   return "/employeelist";
	}
	

}
