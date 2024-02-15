package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.MaterialEntity;
import com.Arth.Entity.PackageRateListEntity;
import com.Arth.Entity.packageEntity;
import com.Arth.Entity.ratelistEntity;
import com.Arth.Repositry.MaterialRepositry;
import com.Arth.Repositry.PackageRateListRepositry;
import com.Arth.Repositry.PackageRepositry;
import com.Arth.Repositry.PackageiteamRepositry;
import com.Arth.Repositry.RatelistRipositry;


@Controller
public class PackageRateListController {
	
	
	@Autowired
	PackageRateListRepositry repositry;
	
	@Autowired
	PackageRepositry pRepositry;
	@Autowired
	RatelistRipositry rRepositry;
	
	@GetMapping("/packagerate")
	public String PackageRateList(Model model) {
		
		List<packageEntity> pName =	pRepositry.findAll();
		model.addAttribute("pName", pName);
		
		List<ratelistEntity> rName = rRepositry.findAll();
		model.addAttribute("rName",rName);
		
		return "/PackageRate";
	}
	
	@PostMapping("/savepackageratelist")
	public String savematerial(PackageRateListEntity pratelist) {
		repositry.save(pratelist);
		return "redirect:/packageratelist";
	}
	

	@GetMapping("/packageratelist")
	public String packageratelist(Model model) {
		List<PackageRateListEntity> packagerlist = repositry.findAll();
		 model.addAttribute("packagerlist",packagerlist);
		return "/packageRatelist";
	}

}
