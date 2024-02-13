package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.DepartmentEntity;
import com.Arth.Entity.packageEntity;
import com.Arth.Repositry.DepartmentRepositry;
import com.Arth.Repositry.PackageRepositry;

@Controller
public class packagecontroller {
	
	@Autowired
	PackageRepositry repositry;
	
	@GetMapping("/package")
	public String packagee() {
		return "/package";
		
	}
	
	@PostMapping("/savePackage")
	public String home(packageEntity packagee) {
		repositry.save(packagee);
		return "redirect:/packagelist";
	}
	
	@GetMapping("/packagelist")
	public String departmentlist(Model model) {
		List<packageEntity> packagee = repositry.findAll();
		 model.addAttribute("packagee",packagee);
		
		return "/packagelist";
	}
	
	
	

}
