package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.EmployeeEntity;
import com.Arth.Entity.Ratetype;
import com.Arth.Entity.RoleEntity;
import com.Arth.Repositry.EmployeeRepositry;
import com.Arth.Repositry.RoleRepositry;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepositry repositry;

	@Autowired
	RoleRepositry roleRepositry;

	@GetMapping("/Employee")
	public String Employee(Model model) {

		List<RoleEntity> rolename = roleRepositry.findAll();
		model.addAttribute("rolename", rolename);

		return "/Employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(EmployeeEntity employee) {
		repositry.save(employee);
		return "redirect:/Employeelist";
	}

	@GetMapping("/Employeelist")
	public String employeelist(Model model) {
		List<EmployeeEntity> employee = repositry.findAll();
		model.addAttribute("employee", employee);

		return "/Employeelist";
	}

	@GetMapping("/deleteemployee")
	public String deleteemployee(@RequestParam("id") Integer employeeId) {

		repositry.deleteById(employeeId);

		return "/Appoinmentlist";
	}

}
