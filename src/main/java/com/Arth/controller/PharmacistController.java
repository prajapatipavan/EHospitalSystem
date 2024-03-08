package com.Arth.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.PharmistEntity;
import com.Arth.Repositry.IteamRepositry;
import com.Arth.Repositry.PharmacistRepositry;

@Controller
public class PharmacistController {
	
	@Autowired
	PharmacistRepositry pharmRepo;
	
	@Autowired
	IteamRepositry itemrepo;
	
	@GetMapping("AddPharmacist")
	public String Pharmacist() {
		
		
		return "Pharmacist";
		
	}

	 @GetMapping("PharmacistDashbaord")
	 public String PharmacistDashbaord(Model model) {
		 

			LocalDate localDate = LocalDate.now();
			Integer month = localDate.getMonth().getValue();
		 
		 List<IteamEntity>  items   = itemrepo.findAll();
		    
		    model.addAttribute("items" ,items);
		    
		    
		    Integer nextmonthexpireiteams = itemrepo.getCurruntMonthexpireiteams(month);
			 model.addAttribute("nextmonthexpireiteams",nextmonthexpireiteams);	    
		 
		 return "PharmacistDashbaord";
	 }
	
	
	@PostMapping("savepharmacist")
	public String savepharmacist(PharmistEntity pharmEntity) {
		
		pharmEntity.setRoleId(7);
		pharmRepo.save(pharmEntity);
		
		return "redirect:/Pharmacistlist";
	}
	
	@GetMapping("Pharmacistlist")
	public String Pharmacistlist(Model model) {
		  
		  List<PharmistEntity>  pharmacistlist    =   pharmRepo.findAll();
		   model.addAttribute("pharmacistlist", pharmacistlist) ; 
		
		return "Pharmacistlist";
	}
	
	@GetMapping("Pharmacistitemslist")
	public String Pharmacistitemslist(Model model) {
		
	   List<IteamEntity> iteam =  itemrepo.findAll();
	   
	   model.addAttribute("iteam",iteam);
		
		return "Pharmacistitemslist";
	}
	
	
	@GetMapping("UpcomingExpireditemspharmacist")
	public String UpcomingExpireditem(Model model) {
		
		LocalDate l = LocalDate.now();
		   Integer month  = l.getMonth().getValue();
		   
	 	
	             List<IteamEntity> product = itemrepo.getupcommingMonthitems(month);
	              model.addAttribute("product",product);
		
		return "UpcomingExpireditemspharmacist";
	}
}
