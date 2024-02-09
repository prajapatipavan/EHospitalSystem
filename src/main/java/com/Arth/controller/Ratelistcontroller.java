package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.DepartmentEntity;
import com.Arth.Entity.packageEntity;
import com.Arth.Entity.ratelistEntity;
import com.Arth.Repositry.PackageRepositry;
import com.Arth.Repositry.RatelistRipositry;

@Controller
public class Ratelistcontroller {
	
	@Autowired
	RatelistRipositry repositry;
	
	@GetMapping("/ratelist")
	public String ratelist() {
		return "/ratelist";
		
	}
	
	@PostMapping("/saveratelist")
	public String home(ratelistEntity ratelist) {
		repositry.save(ratelist);
		return "redirect:/ratelistlist";
	}
	
	@GetMapping("/ralelist")
	public String ratelistlist(Model model) {
		List<ratelistEntity> ratelistlist = repositry.findAll();
		 model.addAttribute("ratelist",ratelistlist);
		
		return "/ratelistlist";
	}

}
