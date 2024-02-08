package com.Arth.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.bean.signupbean;

@Controller
public class SessionController {
	
	@GetMapping("/welcome")
	
	
	public String welcome() {
		
		return "welcome"; 
		
		
	}
	
	
@GetMapping("/signup")
	
	
	public String signup() {
	
	  
	  
		return "signup";
		
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
