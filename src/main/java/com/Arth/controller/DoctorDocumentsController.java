package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.DepartmentEntity;
import com.Arth.Entity.DoctorDocumentsEntity;
import com.Arth.Repositry.DepartmentRepositry;
import com.Arth.Repositry.DoctorDocumentsRepositry;

@Controller
public class DoctorDocumentsController {
	
	@Autowired
	DoctorDocumentsRepositry repositry;
	
	@GetMapping("/docdoctor")
	public String docdoctor() {
		return "/DoctorDocuments";
	}
	
	@PostMapping("/addDoctorDocument")
	public String adddocdoctor(DoctorDocumentsEntity docdoctor) {
		repositry.save(docdoctor);
		return "redirect:/DoctorDocumentslist";
	}
	

	@GetMapping("/DoctorDocumentslist")
	public String docdoctor(Model model) {
		List<DoctorDocumentsEntity> docdoctor = repositry.findAll();
		 model.addAttribute("docdoctor", docdoctor);
		
		return "/DoctorDocumentslist";
	}
	

}
