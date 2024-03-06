package com.Arth.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.AppoinmentRepositry;
import com.Arth.Repositry.IteamRepositry;
import com.Arth.Repositry.patientrepositry;

import jakarta.servlet.http.HttpSession;


@Controller
public class ClerkController {
 
	@Autowired
	AppoinmentRepositry appoinmentRepo;
	
	@Autowired
	patientrepositry patientrepo;
	
	@Autowired
	IteamRepositry itemrepo;
	
	
	
	
	@GetMapping("ClerkDashbord")
	public String ClerkDashbord(AppoinmentEntity entity,Model model,HttpSession session) {
		
		
		LocalDate localDate = LocalDate.now();
		Integer month = localDate.getMonth().getValue();
		
		
		
		Integer year = localDate.getYear();
		
		Integer DayOfMonth = localDate.getDayOfMonth();
		System.out.println(year);
		
		System.out.println(DayOfMonth);
		
		 
		      
		
		  
		 Integer curruntMonthAppoinmet = appoinmentRepo.getCurruntMonthAppoinmentBypatientId(month);
		 model.addAttribute("curruntMonthAppoinmet",curruntMonthAppoinmet);
		 
		
		 
		Integer nextmonthexpireiteams = itemrepo.getCurruntMonthexpireiteams(month);
		 model.addAttribute("nextmonthexpireiteams",nextmonthexpireiteams);
	
		 
		 Integer curruntdayAppoinmet = appoinmentRepo.getCurruntdayAppoinment(DayOfMonth);
		 model.addAttribute("curruntdayAppoinmet",curruntdayAppoinmet);
		 
		                 
		    List<patientEntity>  patients   = patientrepo.findAll();
		    
		    model.addAttribute("patients" ,patients);
		    
           List<AppoinmentEntity>  appoinmets   = appoinmentRepo.findAll();
		    
		    model.addAttribute("appoinmets" ,appoinmets);
		    
		    
  List<IteamEntity>  items   = itemrepo.findAll();
		    
		    model.addAttribute("items" ,items);
		    
		    
		 
		 System.out.println(curruntMonthAppoinmet);
		 
		 
		return "ClerkDashbord";
	}
	
	@GetMapping("todayAppoinments")
	public String todayAppoinments(AppoinmentEntity entity,Model model) {
		
		LocalDate l = LocalDate.now();
		   Integer DayOfMonth  = l.getDayOfMonth();
		   
	 	
	             List<AppoinmentEntity> appoinmentlist = appoinmentRepo.getCurruntDayAppointPatient(DayOfMonth);
	              model.addAttribute("appoinmentlist",appoinmentlist);
		
		return "todayAppoinments";
	}
	
	
	@GetMapping("MonthlyAppoinments")
	public String MonthlyAppoinments(AppoinmentEntity entity,Model model) {
		
		LocalDate l = LocalDate.now();
		   Integer month  = l.getMonth().getValue();
		   
	 	
	             List<AppoinmentEntity> appoinmentlist = appoinmentRepo.getCurruntMonthAppointPatient(month);
	              model.addAttribute("appoinmentlist",appoinmentlist);
		
		return "todayAppoinments";
	}
	
	@GetMapping("UpcomingExpireditem")
	public String UpcomingExpireditem(AppoinmentEntity entity,Model model) {
		
		LocalDate l = LocalDate.now();
		   Integer month  = l.getMonth().getValue();
		   
	 	
	             List<IteamEntity> product = itemrepo.getupcommingMonthitems(month);
	              model.addAttribute("product",product);
		
		return "UpcomingExpireditem";
	}

}
