package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.Arth.Entity.IteamEntity;

import com.Arth.Repositry.IteamRepositry;

@Controller
public class Iteamcontroller {
	
	@Autowired
	IteamRepositry repositry;
	
	@GetMapping("/iteampage")
	public String department() {
		return "/iteam";
	}
	
	@PostMapping("/addItem")
	public String addItem(IteamEntity iteam) {
		repositry.save(iteam);
		return "redirect:/iteamlist";
	}
	

	@GetMapping("/iteamlist")
	public String departmentlist(Model model) {
		List<IteamEntity> iteam = repositry.findAll();
		 model.addAttribute("iteam",iteam);
		return "/iteamlist";
	}
	

}
