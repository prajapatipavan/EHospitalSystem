package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.PackageIteamEntity;
import com.Arth.Entity.packageEntity;
import com.Arth.Repositry.IteamRepositry;
import com.Arth.Repositry.PackageRepositry;
import com.Arth.Repositry.PackageiteamRepositry;

@Controller
public class PackageIteamController {
	
	@Autowired
	PackageiteamRepositry repositry;
	
	@Autowired
	PackageRepositry pRepositry;
	
	@Autowired
	IteamRepositry iRepositry;
	
	@GetMapping("/packageiteam")
	public String department(Model model) {
		
	List<packageEntity> pName =	pRepositry.findAll();
	model.addAttribute("pName", pName);
	
	List<IteamEntity> iName = iRepositry.findAll();
	model.addAttribute("iName",iName);
		
		return "/PackageIteam";
	}
	
	@PostMapping("/savepackageiteam")
	public String savepackageiteam(PackageIteamEntity piteam) {
		repositry.save(piteam);
		return "redirect:/Packageiteamlist";
	}
	

	@GetMapping("/Packageiteamlist")
	public String departmentlist(Model model) {
		List<PackageIteamEntity> piteam = repositry.findAll();
		 model.addAttribute("piteam",piteam);
		
		return "/Packageiteamlist";
	}

}
