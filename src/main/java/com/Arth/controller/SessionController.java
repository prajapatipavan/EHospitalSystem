package com.Arth.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.patientrepositry;
import com.Arth.bean.signupbean;

  

@Controller
public class SessionController {
	
	@Autowired
	patientrepositry repositry;
	
	@Autowired
	BCryptPasswordEncoder bCryptPass;
	
	@GetMapping("/")
	public String welcome() {
		
		return "welcome"; 	
	}
	
	
@GetMapping("/signup")
	
	
	public String signup() {
	
	  
	  
		return "signup";
		
	}

@GetMapping("/login")


public String login() {

  
  
	return "login";
	
}

@PostMapping("/Athenticate")
public String Athenticate(patientEntity patient,Model model) {
	
	  patientEntity loggin = repositry.findByEmail(patient.getEmail());
	  
	  if (loggin == null) {
			
			model.addAttribute("error", "*Invalid UserName And Password");
			return "login";
		} else {
			
			boolean answer = bCryptPass.matches(patient.getPassword(), loggin.getPassword());
			
			if (answer == false) {
				model.addAttribute("error","Invalid Credentials");
				return "login";
			}
			   else if(loggin.getRoleId()==null) {
					
					return "login";
					
				}else if (loggin.getRoleId()==1) {
					
					return "AdminDashboard";
				}
				
				else if (loggin.getRoleId()==4) {
					
					return "FrontDesk";
				}
				
                else if (loggin.getRoleId()==5) {
					
					return "Home";
				}
				
				return "login";
			
			
		}
		
	

}
	 
	


  @GetMapping("/clac")
  public String clac() {
	return "clac";
	
}
  
  

@PostMapping("/saveuser")
public String login(signupbean bean) {
	
	
	    System.out.println(bean.getName());
	    System.out.println(bean.getEmail());
	    System.out.println(bean.getPassword());
	    
	    
	      return "login"; 
	      
	   
	
}

  

}
