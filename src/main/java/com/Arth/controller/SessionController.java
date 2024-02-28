package com.Arth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.DoctorEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.DoctorRepositry;
import com.Arth.Repositry.patientrepositry;

import com.Arth.service.Mailsender;

import jakarta.servlet.http.HttpSession;

  

@Controller
public class SessionController {
	
	@Autowired
	patientrepositry repositry;
	
	@Autowired
	DoctorRepositry dRepositry;
	
	@Autowired
	BCryptPasswordEncoder bCryptPass;
	
	@Autowired
	Mailsender mailsender;
	
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


@GetMapping("/drlogin")


public String Dlogin() {

  
  
	return "doctorlogin";
	
}

@PostMapping("/Athenticate")

public String Athenticate(patientEntity patient,Model model,HttpSession session,DoctorEntity doctor) {
	
	  patientEntity loggin = repositry.findByEmail(patient.getEmail());
	  System.out.println(loggin);
	  
	  if (loggin == null) {
			
			model.addAttribute("error", "*Invalid UserName And Password");
			return "login";
			
		} else {
			
			session.setAttribute("user",loggin);
			
			
			
			boolean answer = bCryptPass.matches(patient.getPassword(), loggin.getPassword());
			
			if (answer == false) {
				model.addAttribute("error","Invalid Credentials");
				return "login";
			}
			   else if(loggin.getRoleId()==null) {
					
					return "login";
					
				}else if (loggin.getRoleId()==5) {
					
					return "welcome";
				}
				
				else if (loggin.getRoleId()==4) {
					
					return "FrontDesk";
				}
				
                else if (loggin.getRoleId()==1) {
					
					return "Home";
				}
				
				return "login";
			
			
		}
		
	

}

@PostMapping("/Athenticate1")

public String Athenticate(Model model,HttpSession session,DoctorEntity doctor) {
	
	  DoctorEntity loggin = dRepositry.findByEmail(doctor.getEmail());
	  System.out.println(loggin);
	  
	  if (loggin == null) {
			
			model.addAttribute("error", "*Invalid UserName And Password");
			return "doctorlogin";
			
		} else {
			
			session.setAttribute("doctor",loggin);
			
			
			
			boolean answer = bCryptPass.matches(doctor.getPassword(), loggin.getPassword());
			
			if (answer == false) {
				model.addAttribute("error","Invalid Credentials");
				return "doctorlogin";
			}
			   else if(loggin.getRoleId()==null) {
					
					return "doctorlogin";
					
				}else if (loggin.getRoleId()==5) {
					
					return "welcome";
				}
				
				else if (loggin.getRoleId()==4) {
					
					return "FrontDesk";
				}
				
                else if (loggin.getRoleId()==2) {
					
					return "AdminDashboard";
				}
				
				return "doctorlogin";
			
			
		}
}




	 


@GetMapping("/forgetpassword")
public String forgetpassword() {
	return "forgetpassword";
	
}

@PostMapping("sendotpforgetpassword")
 public String sendOtpForgetPassword(patientEntity pEntity) {
	
	patientEntity dbpatient = repositry.findByEmail(pEntity.getEmail());
	
	if(dbpatient==null) {
		
		 return "forgetpassword";
	}else {
		
		int otp = (int) (Math.random() * 1000000); 

		
		System.out.println("otp => " + otp);
		
		mailsender.sendOtpForMail(pEntity.getEmail(),otp);
	
		
		dbpatient.setOtp(otp);

		repositry.save(dbpatient);
		
		return "updatepassword";
	}
	
	
	

	
	
}


@PostMapping("updatepassword")

public String updatePassword(patientEntity patient,Model model) {
	
	patientEntity dbPatient =  repositry.findByEmail(patient.getEmail());
	
	  if(! patient.getPassword().equals(patient.getComfirmPassword())) {
		  
		  model.addAttribute("error","*password and confirm password must be match!!");
		  
		  
		  
		  return "updatepassword";
	  }else {
		
		
		
		if(dbPatient==null || patient.getOtp() == -1 || dbPatient.getOtp().intValue() != patient.getOtp().intValue()) {
			
			model.addAttribute("oeerror","*Invalid otp and password!!");
			return "updatepassword";
		}
		else {
			
			   String plaintext = patient.getPassword();
			   
			   String encryptpassword = bCryptPass.encode(plaintext);
			   
			    dbPatient.setPassword(encryptpassword);
			    
			    dbPatient.setOtp(-1);
			    
			    System.out.println(patient.getOtp());
			    System.out.println(patient.getPassword());
			    
			    repositry.save(dbPatient);
			    
			    
		}
	}
	
	return "login";
}
  
  @GetMapping("logout")
  public String logout(HttpSession session) {
	  
	 session.invalidate();
	  
	  return "redirect:/login";
  }
  
  
  @GetMapping("drlogout")
  public String drlogout(HttpSession session) {
	  
	 session.invalidate();
	  
	  return "redirect:/drlogin";
  }


}
