package com.Arth.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.DoctorEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.AppoinmentRepositry;

import jakarta.servlet.http.HttpSession;

@Controller
public class DoctorDashbordController {

	@Autowired
	AppoinmentRepositry repositry;

	@GetMapping("DoctorDashboard")
	public String DoctorDashboard(Model model, HttpSession session) {

		DoctorEntity doctor = (DoctorEntity) session.getAttribute("doctor");

		List<AppoinmentEntity> appoinments = repositry.findByDoctorId(doctor.getDoctorId());

		model.addAttribute("appoinment", appoinments);

		LocalDate l = LocalDate.now();
		Integer DayOfMonth = l.getDayOfMonth();

		List<AppoinmentEntity> appoinmentlist = repositry.getCurrentDayAppointmentByDoctor(DayOfMonth,
				doctor.getDoctorId());
		model.addAttribute("appoinmentlist", appoinmentlist);

		return "DoctorDashboard";
	}

	@GetMapping("DocAppoinmentslist")
	public String Appoinmentslistdoc(Model model, HttpSession session) {

		DoctorEntity doctor = (DoctorEntity) session.getAttribute("doctor");

		List<AppoinmentEntity> appoinments = repositry.findByDoctorId(doctor.getDoctorId());

		model.addAttribute("appoinment", appoinments);

		return "DocAppoinmentslist";
	}

	
	@GetMapping("docappoinmentscelnder")
	public String docappoinmentscelnder(@RequestParam("date")String appoinmentDate,Model model ) {
		
		             List<AppoinmentEntity>  appoinment = repositry.Appoinmentdatewisepatient(appoinmentDate);
		             model.addAttribute("appoinment",appoinment);
		
		
		return "docappoinmentscelnder";
	}
}
