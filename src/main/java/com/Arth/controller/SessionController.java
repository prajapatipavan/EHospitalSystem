package com.Arth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.AdminnEntity;
import com.Arth.Entity.DoctorEntity;
import com.Arth.Entity.PharmistEntity;
import com.Arth.Entity.clerkentity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.AdminRepositry;
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

	@Autowired
	AdminRepositry adminRepo;

	@Autowired
	DoctorRepositry docRepo;

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
	public String Athenticate(patientEntity patient, clerkentity clerk, Model model, PharmistEntity pharmacist,
			AdminnEntity admin, DoctorEntity doctor, HttpSession session) {
		patientEntity logginPatient = repositry.findByEmail(patient.getEmail());
		clerkentity logginClerk = clerkRepo.findByEmail(clerk.getEmail());
		PharmistEntity logginPharmacist = pharmaRepo.findByEmail(pharmacist.getEmail());
		AdminnEntity logginAdmin = adminRepo.findByEmail(admin.getEmail());
		DoctorEntity logginDoctor = docRepo.findByEmail(doctor.getEmail());

		if (logginPatient == null && logginClerk == null && logginPharmacist == null && logginAdmin == null
				&& logginDoctor == null) {
			model.addAttribute("error", "*Invalid UserName And Password");
			return "login";
		} else {
			if (logginPatient != null) {
				session.setMaxInactiveInterval(10 * 60);
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
			} else if (logginAdmin != null) {
				session.setAttribute("admin", logginAdmin);
				boolean answer = bCryptPass.matches(admin.getPassword(), logginAdmin.getPassword());
				if (!answer) {
					model.addAttribute("error", "Invalid Credentials");
					return "login";
				} else if (logginAdmin.getRoleId() == null) {
					return "login";
				} else if (logginAdmin.getRoleId() == 8) {
					return "redirect:/AdminnDashboard";
				}
			} else if (logginDoctor != null) {
				session.setAttribute("doctor", logginDoctor);
				boolean answer = bCryptPass.matches(doctor.getPassword(), logginDoctor.getPassword());
				if (!answer) {
					model.addAttribute("error", "Invalid Credentials");
					return "login";
				} else if (logginDoctor.getRoleId() == null) {
					return "login";
				} else if (logginDoctor.getRoleId() == 1) {
					return "DoctorDashboard";
				}
			}
		}
		return "login";
	}

	@GetMapping("/forgetpassword")
	public String forgetpassword() {
		return "forgetpassword";

	}

	@PostMapping("sendotpforgetpassword")
	public String sendOtpForgetPassword(patientEntity pEntity, clerkentity clerk, PharmistEntity Pharmacist,
			AdminnEntity admin, DoctorEntity doctor) {

		patientEntity dbpatient = repositry.findByEmail(pEntity.getEmail());
		clerkentity dbclerk = clerkRepo.findByEmail(clerk.getEmail());
		PharmistEntity dbPharmist = pharmaRepo.findByEmail(Pharmacist.getEmail());
		AdminnEntity dbAdmin = adminRepo.findByEmail(admin.getEmail());
		DoctorEntity dbDoctor = docRepo.findByEmail(doctor.getEmail());

		if (dbpatient == null && dbclerk == null && dbPharmist == null && dbAdmin == null && dbDoctor == null) {
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

			if (dbAdmin != null) {
				mailsender.sendOtpForMail(admin.getEmail(), otp);
				dbAdmin.setOtp(otp);
				adminRepo.save(dbAdmin);
			}

			if (dbDoctor != null) {
				mailsender.sendOtpForMail(doctor.getEmail(), otp);
				dbDoctor.setOtp(otp);
				docRepo.save(dbDoctor);
			}

			return "updatepassword";
		}
	}

	@PostMapping("updatepassword")
	public String updatePassword(patientEntity patient, Model model, clerkentity clerk, PharmistEntity pharmacist,
			AdminnEntity admin, DoctorEntity doctor) {
		patientEntity dbPatient = repositry.findByEmail(patient.getEmail());
		clerkentity dbClerk = clerkRepo.findByEmail(clerk.getEmail());
		PharmistEntity dbPharmacist = pharmaRepo.findByEmail(pharmacist.getEmail());
		AdminnEntity dbAdmin = adminRepo.findByEmail(admin.getEmail());
		DoctorEntity dbDoctor = docRepo.findByEmail(doctor.getEmail());

		// Check if neither patient, clerk, pharmacist, admin, nor doctor is found
		if (dbPatient == null && dbClerk == null && dbPharmacist == null && dbAdmin == null && dbDoctor == null) {
			model.addAttribute("error", "*Invalid email address");
			return "updatepassword";
		}

		// Check if password and confirm password match
		// Implement your password matching logic here

		// Check if OTP and patient exist
		if (dbPatient != null
				&& (patient.getOtp() == -1 || dbPatient.getOtp().intValue() != patient.getOtp().intValue())) {
			model.addAttribute("oeerror", "*Invalid OTP or email address");
			return "updatepassword";
		}

		// Check if OTP and clerk exist
		if (dbClerk != null && (clerk.getOtp() == -1 || dbClerk.getOtp().intValue() != clerk.getOtp().intValue())) {
			model.addAttribute("oeerror", "*Invalid OTP or email address");
			return "updatepassword";
		}

		// Check if OTP and pharmacist exist
		if (dbPharmacist != null
				&& (pharmacist.getOtp() == -1 || dbPharmacist.getOtp().intValue() != pharmacist.getOtp().intValue())) {
			model.addAttribute("oeerror", "*Invalid OTP or email address");
			return "updatepassword";
		}

		// Check if OTP and admin exist
		if (dbAdmin != null && (admin.getOtp() == -1 || dbAdmin.getOtp().intValue() != admin.getOtp().intValue())) {
			model.addAttribute("oeerror", "*Invalid OTP or email address");
			return "updatepassword";
		}

		// Check if OTP and doctor exist
		if (dbDoctor != null && (doctor.getOtp() == -1 || dbDoctor.getOtp().intValue() != doctor.getOtp().intValue())) {
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

		// Update admin's password
		if (dbAdmin != null) {
			String plaintext = admin.getPassword();
			String encryptpassword = bCryptPass.encode(plaintext);
			dbAdmin.setPassword(encryptpassword);
			dbAdmin.setOtp(-1);
			adminRepo.save(dbAdmin);
		}

		// Update doctor's password
		if (dbDoctor != null) {
			String plaintext = doctor.getPassword();
			String encryptpassword = bCryptPass.encode(plaintext);
			dbDoctor.setPassword(encryptpassword);
			dbDoctor.setOtp(-1);
			docRepo.save(dbDoctor);
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
