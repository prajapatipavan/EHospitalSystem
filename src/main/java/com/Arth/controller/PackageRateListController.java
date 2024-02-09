package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.MaterialEntity;
import com.Arth.Entity.PackageRateListEntity;
import com.Arth.Repositry.MaterialRepositry;
import com.Arth.Repositry.PackageRateListRepositry;
import com.Arth.Repositry.PackageiteamRepositry;

public class PackageRateListController {
	
	
	@Autowired
	PackageRateListRepositry repositry;
	
	@GetMapping("/packagerate")
	public String PackageRateList() {
		return "/PackageRate";
	}
	
	@PostMapping("/savepackageratelist")
	public String savematerial(PackageRateListEntity pratelist) {
		repositry.save(pratelist);
		return "redirect:/packageratelist";
	}
	

	@GetMapping("/packageratelist")
	public String packageratelist(Model model) {
		List<PackageRateListEntity> material = repositry.findAll();
		 model.addAttribute("material",material);
		return "/packageRatelist";
	}

}
