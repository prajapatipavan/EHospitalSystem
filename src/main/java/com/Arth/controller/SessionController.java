package com.Arth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.DoctorEntity;
import com.Arth.Entity.PharmistEntity;
import com.Arth.Entity.clerkentity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.DoctorRepositry;
import com.Arth.Repositry.PharmacistRepositry;
import com.Arth.Repositry.clerkRepositry;
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
	clerkRepositry clerkRepo;
	
	@Autowired
	Mailsender mailsender;
	
	@Autowired
	PharmacistRepositry pharmaRepo;
	
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
public String Athenticate(patientEntity patient, clerkentity clerk, Model model, PharmistEntity pharmacist, HttpSession session) {
    patientEntity logginPatient = repositry.findByEmail(patient.getEmail());
    clerkentity logginClerk = clerkRepo.findByEmail(clerk.getEmail());
    PharmistEntity logginPharmacist = pharmaRepo.findByEmail(pharmacist.getEmail());
  
    if (logginPatient == null && logginClerk == null && logginPharmacist == null) {
        model.addAttribute("error", "*Invalid UserName And Password");
        return "login";
    } else {
        if (logginPatient != null) {
            session.setAttribute("user", logginPatient);
            boolean answer = bCryptPass.matches(patient.getPassword(), logginPatient.getPassword());
            if (!answer) {
                model.addAttribute("error", "Invalid Credentials");
                return "login";
            } else if (logginPatient.getRoleId() == null) {
                return "login";
            } else if (logginPatient.getRoleId() == 5) {
                return "welcome";
            } 
        } else if (logginClerk != null) {
            session.setAttribute("clerk", logginClerk);
            boolean answer = bCryptPass.matches(clerk.getPassword(), logginClerk.getPassword());
            if (!answer) {
                model.addAttribute("error", "Invalid Credentials");
                return "login";
            } else if (logginClerk.getRoleId() == null) {
                return "login";
            } else if (logginClerk.getRoleId() == 6) {
                return "redirect:/ClerkDashbord";
            } else if (logginClerk.getRoleId() == 1) {
                return "Home";
            }
        } else if (logginPharmacist != null) {
            session.setAttribute("pharmacist", logginPharmacist);
            boolean answer = bCryptPass.matches(pharmacist.getPassword(), logginPharmacist.getPassword());
            if (!answer) {
                model.addAttribute("error", "Invalid Credentials");
                return "login";
            } else if (logginPharmacist.getRoleId() == null) {
                return "login";
            } else if (logginPharmacist.getRoleId() == 7) {
                return "redirect:/PharmacistDashbaord";
            }
        }
    }
    return "login";
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
 public String sendOtpForgetPassword(patientEntity pEntity,clerkentity clerk,PharmistEntity Pharmacist) {
	
	patientEntity dbpatient = repositry.findByEmail(pEntity.getEmail());
	clerkentity  dbclerk  = clerkRepo.findByEmail(clerk.getEmail());
	PharmistEntity dbPharmist = pharmaRepo.findByEmail(Pharmacist.getEmail());
	
	
	System.out.println(dbPharmist);
	
	
	 if (dbpatient == null && dbclerk == null && dbPharmist==null) {
	        return "forgetpassword";
	    } else {
	        int otp = (int) (Math.random() * 1000000); 
	        System.out.println("otp => " + otp);
	        
	        if (dbpatient != null) {
	            mailsender.sendOtpForMail(pEntity.getEmail(), otp);
	            dbpatient.setOtp(otp);
	            repositry.save(dbpatient);
	        }
	        
	        if (dbclerk != null) {
	            mailsender.sendOtpForMail(clerk.getEmail(), otp);
	            dbclerk.setOtp(otp);
	            clerkRepo.save(dbclerk);
	        }
	        
	        if (dbPharmist != null) {
	            mailsender.sendOtpForMail(Pharmacist.getEmail(), otp);
	            dbPharmist.setOtp(otp);
	            pharmaRepo.save(dbPharmist);
	        }
	        
	        return "updatepassword";
	    }
	

	
	
}


@PostMapping("updatepassword")
public String updatePassword(patientEntity patient, Model model, clerkentity clerk, PharmistEntity pharmacist) {
    patientEntity dbPatient = repositry.findByEmail(patient.getEmail());
    clerkentity dbClerk = clerkRepo.findByEmail(clerk.getEmail());
    PharmistEntity dbPharmacist = pharmaRepo.findByEmail(pharmacist.getEmail());

    // Check if neither patient, clerk, nor pharmacist is found
    if (dbPatient == null && dbClerk == null && dbPharmacist == null) {
        model.addAttribute("error", "*Invalid email address");
        return "updatepassword";
    }

    // Check if password and confirm password match
    // Implement your password matching logic here

    // Check if OTP and patient exist
    if (dbPatient != null && (patient.getOtp() == -1 || dbPatient.getOtp().intValue() != patient.getOtp().intValue())) {
        model.addAttribute("oeerror", "*Invalid OTP or email address");
        return "updatepassword";
    }

    // Check if OTP and clerk exist
    if (dbClerk != null && (clerk.getOtp() == -1 || dbClerk.getOtp().intValue() != clerk.getOtp().intValue())) {
        model.addAttribute("oeerror", "*Invalid OTP or email address");
        return "updatepassword";
    }

    // Check if OTP and pharmacist exist
    if (dbPharmacist != null && (pharmacist.getOtp() == -1 || dbPharmacist.getOtp().intValue() != pharmacist.getOtp().intValue())) {
        model.addAttribute("oeerror", "*Invalid OTP or email address");
        return "updatepassword";
    }

    // Update patient's password
    if (dbPatient != null) {
        String plaintext = patient.getPassword();
        String encryptpassword = bCryptPass.encode(plaintext);
        dbPatient.setPassword(encryptpassword);
        dbPatient.setOtp(-1);
        repositry.save(dbPatient);
    }

    // Update clerk's password
    if (dbClerk != null) {
        String plaintext = clerk.getPassword();
        String encryptpassword = bCryptPass.encode(plaintext);
        dbClerk.setPassword(encryptpassword);
        dbClerk.setOtp(-1);
        clerkRepo.save(dbClerk);
    }

    // Update pharmacist's password
    if (dbPharmacist != null) {
        String plaintext = pharmacist.getPassword();
        String encryptpassword = bCryptPass.encode(plaintext);
        dbPharmacist.setPassword(encryptpassword);
        dbPharmacist.setOtp(-1);
        pharmaRepo.save(dbPharmacist);
    }

    return "login"; // Redirect to login page
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
