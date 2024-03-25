package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.DoctorEntity;
import com.Arth.Entity.EmployeeEntity;
import com.Arth.Entity.Ratetype;
import com.Arth.Entity.patientEntity;
import com.Arth.Entity.ratelistEntity;
import com.Arth.Repositry.AppoinmentRepositry;
import com.Arth.Repositry.DoctorRepositry;
import com.Arth.Repositry.EmployeeRepositry;
import com.Arth.Repositry.RatelistRipositry;
import com.Arth.Repositry.patientrepositry;
import com.Arth.service.appoinmentmail;

import jakarta.mail.Session;
import jakarta.servlet.http.HttpSession;

@Controller
public class AppoinmentController {

	@Autowired
	AppoinmentRepositry repositry;

	@Autowired
	DoctorRepositry dRepositry;

	@Autowired
	patientrepositry patientrepositry;

	@Autowired
	RatelistRipositry ratelistRipositry;

	@Autowired
	EmployeeRepositry eRepositry;
	
	@Autowired
	appoinmentmail mappoinment;

	@GetMapping("/appoinment")
	public String department(Model model,HttpSession session) {

		List<DoctorEntity> dname = dRepositry.findAll();
		model.addAttribute("dname", dname);

		 patientEntity patient = (patientEntity) session.getAttribute("user");
		
		List<patientEntity> pname = patientrepositry.findBypatientId(patient.getPatientId());
		model.addAttribute("pname", pname);

		List<ratelistEntity> ratelistname = ratelistRipositry.findAll();
		model.addAttribute("ratelistname", ratelistname);

		List<EmployeeEntity> eName = eRepositry.findAll();
		model.addAttribute("eName", eName);

		return "/Appoinment";
	}

	@PostMapping("/saveappointment")
	public String saveappointment(AppoinmentEntity appoinment, HttpSession session) {

		patientEntity patient = (patientEntity) session.getAttribute("user");

		appoinment.setPatientId(patient.getPatientId());

		appoinment.setAppoinmentStatusId(1);
		
		
		String appointmentDetails = "Date: " + appoinment.getAppoinmentDate() + "\n" +
                "Patient Name: " + patient.getFirstName() + " " + patient.getLastName() + "\n" ;
                
		
		mappoinment.sendappoinmentForMail(patient.getEmail(), appointmentDetails);
		
		System.out.println(patient.getEmail());

		repositry.save(appoinment);
		return "redirect:/patientAppoinmentlist";
	}

	@GetMapping("/Appoinmentlist")
	public String departmentlist(Model model, HttpSession session) {

		

		List<AppoinmentEntity> appoinment = repositry.findAll();
		
		model.addAttribute("appoinment", appoinment);
		
		System.out.println();

		return "/Appoinmentlist";
	}

	@GetMapping("/deleteAppoinment")
	public String deleteAppoinment(@RequestParam("id") Integer appoinmentId) {

		repositry.deleteById(appoinmentId);

		return "redirect:/patientAppoinmentlist";
	}

	@GetMapping("/deleteAppoinmenttoday")
	public String deleteAppoinmenttoday(@RequestParam("id") Integer appoinmentId) {

		repositry.deleteById(appoinmentId);

		return "redirect:/todayAppoinments";
	}

	@GetMapping("/deleteAppoinmentMontly")
	public String deleteAppoinmentMontly(@RequestParam("id") Integer appoinmentId) {

		repositry.deleteById(appoinmentId);

		return "redirect:/MonthlyAppoinments";
	}

	@GetMapping("/deleteAppoinmentclerk")
	public String eleteAppoinmentclerk(@RequestParam("id") Integer appoinmentId) {

		repositry.deleteById(appoinmentId);

		return "/Appoinmentlist";
	}

	/*----------------- Edit Appoinment--------------*/

	@GetMapping("/patientAppoinmentEdit")
	public String EdituserAppoinment(@RequestParam("id") Integer appoinmentId, Model model) {

		List<DoctorEntity> dname = dRepositry.findAll();
		model.addAttribute("dname", dname);

		List<patientEntity> pname = patientrepositry.findAll();
		model.addAttribute("pname", pname);

		List<ratelistEntity> ratelistname = ratelistRipositry.findAll();
		model.addAttribute("ratelistname", ratelistname);

		List<EmployeeEntity> eName = eRepositry.findAll();
		model.addAttribute("eName", eName);

		AppoinmentEntity appoinment = repositry.findById(appoinmentId).get();
		model.addAttribute("appoinment", appoinment);
		System.out.println(appoinment);

		return "/patientAppoinmentEdit";
	}
  /* --------------------------calander wise appoinment-------------------------------------------*/
	
	@GetMapping("appoinmentlists")
	public String appoinmentlists(@RequestParam("date") String appoinmentDate,Model model ) {
		
		
		
		    List<AppoinmentEntity>  appoinmet = repositry.Appoinmentdatewisepatient(appoinmentDate);
		    
		     model.addAttribute("appoinmet",appoinmet);
		    
		
		return "appoinmentlists";
	}
	
}
