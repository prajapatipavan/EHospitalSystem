package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@PostMapping("/rolelists")
	public String rolelits(RoleEntity role) {
		repositry.save(role);
		return "redirect:/rolelist";
	}
	
	@GetMapping("/rolelist")
	public String rolelist(Model model) {
		 List<RoleEntity> roles = repositry.findAll();
		 model.addAttribute("roles",roles);
		 
		return "/rolelist";
	}
	
	@GetMapping("/deleterole")
	public String deleteRole(@RequestParam("id") Integer roleId) {
		
		repositry.deleteById(roleId);
		
		return "redirect:/rolelist";
	}
	
	

}
