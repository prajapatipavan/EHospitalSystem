package com.Arth.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.DoctorEntity;
import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.PaymentsEntity;
import com.Arth.Entity.PharmistEntity;
import com.Arth.Entity.ServiceTypeEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.DoctorRepositry;
import com.Arth.Repositry.IteamRepositry;
import com.Arth.Repositry.PaymentsRepositry;
import com.Arth.Repositry.PharmacistRepositry;
import com.Arth.Repositry.ServiceTypeRepositry;
import com.Arth.Repositry.patientrepositry;

@Controller
public class AdminController {
	
	@Autowired
	DoctorRepositry doctorRepo;
	
	@Autowired
	patientrepositry patientRepo;
	
	@Autowired
	PharmacistRepositry pharmacistrepo;
	
	@Autowired
	PaymentsRepositry paymentRepo;
	
	@Autowired
	IteamRepositry itemrepo;
	
	@Autowired
	ServiceTypeRepositry serviceTypeRepositry;
	
	
	 @GetMapping("AdminnDashboard")
	 public String AdminnDashboard(DoctorEntity doctorEntity,Model model) {
		 
		    List<DoctorEntity> doctor= doctorRepo.findAll();
		  model.addAttribute("doctor" ,doctor);
		  
		  List<patientEntity> patients= patientRepo.findAll();
		  model.addAttribute("patients" ,patients);
		  
		  List<PharmistEntity> pharmacist= pharmacistrepo.findAll();
		  model.addAttribute("pharmacist" ,pharmacist);
		  
		  List<PaymentsEntity> paymets= paymentRepo.findAll();
		  model.addAttribute("paymets" ,paymets);
		  
		  List<IteamEntity>  items   = itemrepo.findAll();
		    
		    model.addAttribute("items" ,items);
		        
		 
		 return "AdminNewDashboard";
	 }
	 
	 

	 @GetMapping("Admindoctor")
	 public String Admindoctor(DoctorEntity doctorEntity,Model model) {
		 
		   List<DoctorEntity> doctor= doctorRepo.findAll();
			  model.addAttribute("doctor" ,doctor);
		 
		 return "Admindoctor";
	 }
	 
	
	 
	 
	 @GetMapping("viewadmindoctor")
	 public String  viewadmindoctor(@RequestParam("id") Integer doctorId,Model model) {
		 
		   Optional<DoctorEntity> doctor  =doctorRepo.findById(doctorId);
			
		   if(doctor.isPresent()) {
			   
			   DoctorEntity doctors = doctor.get();
			   model.addAttribute("doctors",doctors);
			   
			   return "Admindoctorsingle";
			   
		   }else {
			
			   return "Admindoctor";
		}
		   
	
	}
	 
	 
	 @GetMapping("Admindoctoredit")
	 public String Admindoctoredit(@RequestParam("id") Integer doctorId,Model model) {
		 
		   DoctorEntity doctors  =doctorRepo.findById(doctorId).get();
		   
		   model.addAttribute("doctors",doctors);
		   
		   List<ServiceTypeEntity> servicetype =	serviceTypeRepositry.findAll();
		     model.addAttribute("servicetype",servicetype);
		   
		 return "Admindoctoredit";
	 }
		
	 
	 
	 @GetMapping("Adminpatients")
	 public String Adminpatients(patientEntity patientEntity,Model model) {
		 
		   List<patientEntity> patients= patientRepo.findAll();
			  model.addAttribute("patients" ,patients);
		 
		 return "Adminpatients";
	 }
	 
	 @GetMapping("Adminpharmacist")
	 public String Adminpharmacist(PharmistEntity pharmistEntity,Model model) {
		 
		   List<PharmistEntity> pharmacist= pharmacistrepo.findAll();
			  model.addAttribute("pharmacist" ,pharmacist);
		 
		 return "Adminpharmacist"; 
	 }
	 
	 
	 @GetMapping("AdminPayments")
	 public String AdminPayments(PharmistEntity pharmistEntity,Model model) {
		 
		  List<PaymentsEntity> paymets= paymentRepo.findAll();
		  model.addAttribute("paymets" ,paymets);
		 
		 return "AdminPayments"; 
	 }
	 
	 
	 @GetMapping("deleteAdminPayments")
	 public String deleteAdminPayments(@RequestParam("id")Integer paymentId,Model model) {
		 
		        paymentRepo.deleteById(paymentId);
		 
		 return "redirect:/AdminPayments"; 
	 }
	 
	
	 
	 @GetMapping("Adminitems")
	 public String  Adminitems(PharmistEntity pharmistEntity,Model model) {
		 
		 List<IteamEntity>  items   = itemrepo.findAll();
		    
		    model.addAttribute("items" ,items);
		 
		 return "Adminitems"; 
	 }
	 
	 @GetMapping("/deleteAdminiteam")
		public String deleteiteam(@RequestParam("id") Integer itemId ) {
			
			   itemrepo.deleteById(itemId);
			
			return "Adminitems";
		}
		
	 
	 

}
