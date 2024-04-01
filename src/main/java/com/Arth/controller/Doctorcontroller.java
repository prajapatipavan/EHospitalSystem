package com.Arth.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.DoctorEntity;
import com.Arth.Entity.ServiceTypeEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.AppoinmentRepositry;
import com.Arth.Repositry.DoctorRepositry;
import com.Arth.Repositry.ServiceTypeRepositry;
import com.Arth.dto.Appoinmentdto;

import jakarta.servlet.http.HttpSession;

@Controller
public class Doctorcontroller {

	@Autowired
	DoctorRepositry repositry;

	@Autowired
	ServiceTypeRepositry serviceTypeRepositry;

	@Autowired
	AppoinmentRepositry appoinmentRepo;

	@Autowired
	BCryptPasswordEncoder bCryptpass;

	@GetMapping("/doctorpage")
	public String doctorpage(Model model) {

		List<ServiceTypeEntity> servicetype = serviceTypeRepositry.findAll();
		model.addAttribute("servicetype", servicetype);

		return "doctor";
	}

	@PostMapping("/addDoctors")
	public String addDoctor(DoctorEntity doctor) {
		doctor.setRoleId(1);

		String plaintext = doctor.getPassword();

		String encryptpassword = bCryptpass.encode(plaintext);

		doctor.setPassword(encryptpassword);

		repositry.save(doctor);

		return "redirect:/doctorlist";
	}

	@GetMapping("/doctorlist")
	public String departmentlist(Model model) {
		List<DoctorEntity> doctor = repositry.findAll();
		model.addAttribute("doctor", doctor);

		return "doctorlist";
	}

	@GetMapping("/deletedoctor")
	public String deletedoctor(@RequestParam("id") Integer doctorId) {

		repositry.deleteById(doctorId);

		return "redirect:/doctorlist";
	}

	@GetMapping("viewdoctor")
	public String viewdoctor(@RequestParam("id") Integer doctorId, Model model) {

		Optional<DoctorEntity> doctor = repositry.findById(doctorId);

		if (doctor.isPresent()) {

			DoctorEntity doctors = doctor.get();
			model.addAttribute("doctors", doctors);

			return "drsingle";

		} else {

			return "redirect:/doctorlist";
		}

	}
	
	
	@GetMapping("viewdoctorprofile")
	public String iewdoctorprofile(@RequestParam("id") Integer doctorId, Model model) {

		Optional<DoctorEntity> doctor = repositry.findById(doctorId);

		if (doctor.isPresent()) {

			DoctorEntity doctors = doctor.get();
			model.addAttribute("doctors", doctors);

			return "doctorProfile";

		} else {

			return "redirect:/doctorlist";
		}

	}


	@GetMapping("/todaydoctorAppoinments")
	public String deletedoctor(HttpSession session, Model model) {

		DoctorEntity doctor = (DoctorEntity) session.getAttribute("doctor");

		LocalDate l = LocalDate.now();
		Integer DayOfMonth = l.getDayOfMonth();

		List<Appoinmentdto> appoinmentlist = appoinmentRepo.getCurrentDayAppointmentByDoctor(DayOfMonth,
				doctor.getDoctorId());
		model.addAttribute("appoinmentlist", appoinmentlist);

		return "todaydoctorAppoinments";
	}

}
