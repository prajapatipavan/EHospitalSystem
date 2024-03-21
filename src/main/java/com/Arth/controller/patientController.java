package com.Arth.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.clerkentity;
import com.Arth.Entity.packageEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Entity.ratelistEntity;
import com.Arth.Repositry.RatelistRipositry;
import com.Arth.Repositry.patientrepositry;
import com.Arth.service.Weicomemailsend;

@Controller
public class patientController {

	@Autowired

	patientrepositry rpatient;

	@Autowired
	RatelistRipositry ratelistRipo;

	@Autowired
	BCryptPasswordEncoder bCryptpass;

	@Autowired
	Weicomemailsend mailsend;

	@GetMapping("patientprofile")
	public String patientprofile() {

		return "patient";
	}

	@PostMapping("/savepatient")
	public String savePatient(patientEntity patient, Model model, clerkentity clerk) {

		patient.setRoleId(5);

		patientEntity patientemail = rpatient.findByEmail(patient.getEmail());

		System.out.println(patientemail);

		if (patientemail != null) {

			model.addAttribute("eerror", "*Email Alreday Register");

			return "patient";
		}

		if (!patient.getPassword().equals(patient.getComfirmPassword())) {
			model.addAttribute("passerror", "*password and Confirm password not same");
			return "patient";
		}

		String plaintext = patient.getPassword();

		String encryptpassword = bCryptpass.encode(plaintext);

		patient.setPassword(encryptpassword);

		/* mailsend.welcomeMailSend(patient.getEmail(),patient.getFirstName()); */

		rpatient.save(patient);

		return "redirect:/login";
	}

	@GetMapping("/patientlist")
	public String patientlist(Model model) {
		List<patientEntity> patient = rpatient.findAll();
		model.addAttribute("patient", patient);

		return "/patientlist";
	}

	@GetMapping("/patientlists")
	public String patientlists(Model model) {
		List<patientEntity> patient = rpatient.findAll();
		model.addAttribute("patient", patient);

		return "/patientlistclerk";
	}

	@GetMapping("/deletepatient")
	public String deletepatient(@RequestParam("id") Integer patientId) {

		rpatient.deleteById(patientId);
		return "redirect:/patientlist";
	}

	@GetMapping("/viewpatient")
	public String viewpatient(@RequestParam("id") Integer patientId, Model model) {

		Optional<patientEntity> patient = rpatient.findById(patientId);

		if (patient.isPresent()) {

			patientEntity patiente = patient.get();
			model.addAttribute("patiente", patiente);

			return "singlepatient";

		} else {

			return "redirect:/patientlist";
		}

	}

	@GetMapping("/viewpatientopd")
	public String viewpatientopd(@RequestParam("id") Integer patientId, Model model) {

		List<ratelistEntity> ratelistEntity = ratelistRipo.findAll();

		model.addAttribute("ratelist", ratelistEntity);

		Optional<patientEntity> patient = rpatient.findById(patientId);

		if (patient.isPresent()) {

			patientEntity patiente = patient.get();
			model.addAttribute("patiente", patiente);

			return "singlepatientopd";

		} else {

			return "redirect:/patientlist";
		}

	}

	@GetMapping("singlepatient")
	public String singlepatient() {

		return "singlepatient";
	}

}
