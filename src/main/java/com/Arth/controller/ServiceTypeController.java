package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.RoleEntity;
import com.Arth.Entity.ServiceTypeEntity;
import com.Arth.Repositry.RoleRepositry;
import com.Arth.Repositry.ServiceTypeRepositry;

@Controller
public class ServiceTypeController {
	
	@Autowired
	ServiceTypeRepositry repositry;
	
	@GetMapping("/servicetype")
	public String servicetype() {
		return "/serviceType";
	}
	
	@PostMapping("/servicetype")
	public String serviceType(ServiceTypeEntity stype) {
		repositry.save(stype);
		return "redirect:/serviceTypelist";
	}
	
	@GetMapping("/serviceTypelist")
	public String serviceTypelist(Model model) {
		 List<ServiceTypeEntity> stype = repositry.findAll();
		 model.addAttribute("stype",stype);
		
		return "/serviceTypelist";
	}
	
	
	
}
