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
import com.Arth.dto.Appoinmentdto;

import jakarta.servlet.http.HttpSession;

@Controller
public class DoctorDashbordController {

	@Autowired
	AppoinmentRepositry repositry;

	@GetMapping("DoctorDashboard")
	public String DoctorDashboard(Model model, HttpSession session) {

		DoctorEntity doctor = (DoctorEntity) session.getAttribute("doctor");

		List<Appoinmentdto> appoinments = repositry.findByDoctorId(doctor.getDoctorId());

		model.addAttribute("appoinment", appoinments);

		LocalDate l = LocalDate.now();
		Integer DayOfMonth = l.getDayOfMonth();

		List<Appoinmentdto> appoinmentlist = repositry.getCurrentDayAppointmentByDoctor(DayOfMonth,
				doctor.getDoctorId());
		model.addAttribute("appoinmentlist", appoinmentlist);
		
		
		
		LocalDate m = LocalDate.now();
		Integer month = m.getMonth().getValue();
		
		List<Appoinmentdto> doctors  =  repositry.getCurrentMonthAppointmentByDoctor(month,doctor.getDoctorId());
		
		model.addAttribute("doctors",doctors);
		
		System.out.print(doctors.size());
		
		List<Appoinmentdto> appoinmentlists = repositry.getCurrentDayAppointmentByDoctor(DayOfMonth,
				doctor.getDoctorId());
		model.addAttribute("appoinment", appoinmentlists);
		
		
	
		

		return "DoctorDashboard";
	}

	@GetMapping("DocAppoinmentslist")
	public String Appoinmentslistdoc(Model model, HttpSession session) {

		DoctorEntity doctor = (DoctorEntity) session.getAttribute("doctor");

		List<Appoinmentdto> appoinments = repositry.findByDoctorId(doctor.getDoctorId());

		model.addAttribute("appoinment", appoinments);

		return "DocAppoinmentslist";
	}

	
	@GetMapping("docappoinmentscelnder")
	public String docappoinmentscelnder(@RequestParam("date")String appoinmentDate,Model model ) {
		
		             List<Appoinmentdto>  appoinment = repositry.Appoinmentdatewisepatient(appoinmentDate);
		             model.addAttribute("appoinment",appoinment);
		
		
		return "docappoinmentscelnder";
	}
}
