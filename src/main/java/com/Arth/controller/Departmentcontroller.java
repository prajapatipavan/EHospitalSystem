package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.DepartmentEntity;
import com.Arth.Entity.RoleEntity;
import com.Arth.Repositry.DepartmentRepositry;

@Controller
public class Departmentcontroller {
	
	@Autowired
	DepartmentRepositry repositry;
	
	@GetMapping("/department")
	public String department() {
		return "/department";
	}
	
	@PostMapping("/saveDepartment")
	public String saveDepartment (DepartmentEntity department) {
		repositry.save(department);
		return "redirect:/departmentlist";
	}
	

	@GetMapping("/departmentlist")
	public String departmentlist(Model model) {
		List<DepartmentEntity> depart = repositry.findAll();
		 model.addAttribute("depart",depart);
		return "/departmentlist";
	}
	
	@GetMapping("/deletedepartment")
	public String deletedepartment(@RequestParam("id") Integer departmentId ) {
		
		   repositry.deleteById(departmentId);
		
		return "redirect:/departmentlist";
	}

	

}
