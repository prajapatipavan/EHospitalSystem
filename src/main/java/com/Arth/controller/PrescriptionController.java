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
import com.Arth.Entity.PrescriptionEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Repositry.AppoinmentRepositry;
import com.Arth.Repositry.PrescriptionRepositry;
import com.Arth.Repositry.patientrepositry;
import com.Arth.dto.prescriptiondto;

import jakarta.servlet.http.HttpSession;

@Controller
public class PrescriptionController {

	@Autowired
	PrescriptionRepositry pRepositry;

	@Autowired
	AppoinmentRepositry repositry;

	@GetMapping("Prescriptionpage")
	public String Prescription(HttpSession session, Model model) {

		DoctorEntity doctor = (DoctorEntity) session.getAttribute("doctor");

		List<AppoinmentEntity> appoinments = repositry.findBydoctorId(doctor.getDoctorId());

		model.addAttribute("appoinment", appoinments);

		return "Prescriptionpage";
	}

	@GetMapping("Prescriptionlist")
	public String Prescriptionlist(Model model) {

		List<prescriptiondto> prescription = pRepositry.findByAllPatientIdtoprecriptiondto();
		model.addAttribute("prescription", prescription);

		return "Prescriptionlist";
	}
	
	
	@GetMapping("patientprescriptionlist")
	public String patientprescriptionlist(HttpSession session, Model model) {

		patientEntity patient = (patientEntity) session.getAttribute("user");

		List<prescriptiondto> prescription = pRepositry.findByPatientIdtoprecriptiondto(patient.getPatientId());

		model.addAttribute("prescription", prescription);

		return "patientprescriptionlist";
	}

	@PostMapping("savePrescription")
	public String savePrescription(PrescriptionEntity prescription) {

		pRepositry.save(prescription);

		return "redirect:/Prescriptionlist";
	}

	@GetMapping("deleteprecription")
	public String eleteprecription(@RequestParam("id") Integer prescriptionId) {

		pRepositry.deleteById(prescriptionId);

		return "redirect:/Prescriptionlist";
	}
}
