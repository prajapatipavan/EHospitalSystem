package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Entity.patientItemEntity;
import com.Arth.Repositry.IteamRepositry;
import com.Arth.Repositry.patientItemRepositry;
import com.Arth.Repositry.patientrepositry;

@Controller
public class patientItemsController {
	
	@Autowired
	IteamRepositry itemRepo;
	
	@Autowired
	patientrepositry patientrepo;
	
	@Autowired
	patientItemRepositry patientitemRepo;
	
	
	@GetMapping("addpatientitem")
	public String addpatientitem(Model model) {
		
		 List<IteamEntity> item = itemRepo.findAll();
		 model.addAttribute("item",item);
		 
		 List<patientEntity> patient = patientrepo.findAll();
		 model.addAttribute("patient",patient);
		 
		
		return "patientItem";
	}
	
	
	@PostMapping("savepatientiem")
	public String savepatientiem(patientItemEntity patientitem) {
		
		patientitemRepo.save(patientitem);
		
		return "redirect:/patientItemlist";
	}
	
	
	@GetMapping("patientItemlist")
	public String patientItemlist(Model model) {
		
		    List<patientItemEntity>  patientItem =  patientitemRepo.findAll();
		    
		    model.addAttribute("patientItem",patientItem);
		
		return "patientItemlist";
	}

}
