package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.Arth.Entity.PackageIteamEntity;

import com.Arth.Repositry.PackageiteamRepositry;

@Controller
public class PackageIteamController {
	
	@Autowired
	PackageiteamRepositry repositry;
	
	@GetMapping("/packageiteam")
	public String department() {
		return "/PackageIteam";
	}
	
	@PostMapping("/savepackageiteam")
	public String savepackageiteam(PackageIteamEntity piteam) {
		repositry.save(piteam);
		return "Appoinment";
	}
	

	/*@GetMapping("/Packageiteamlist")
	public String departmentlist(Model model) {
		List<PackageIteamEntity> piteam = repositry.findAll();
		 model.addAttribute("piteam",piteam);
		
		return "/Packageiteamlist";
	}*/

}
