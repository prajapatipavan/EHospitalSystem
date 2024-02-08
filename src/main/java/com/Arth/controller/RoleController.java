package com.Arth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.RoleEntity;
import com.Arth.Repositry.RoleRepositry;

@Controller
public class RoleController {
	
	@Autowired
	RoleRepositry repositry;
	
	@GetMapping("/newrole")
	public String newrole() {
		return "/role";
	}
	
	@PostMapping("/home")
	public String home(RoleEntity role) {
		repositry.save(role);
		return "/welcome";
	}
	
	

}
