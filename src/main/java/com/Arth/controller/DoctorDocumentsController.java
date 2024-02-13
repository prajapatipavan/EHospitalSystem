package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Arth.Entity.DepartmentEntity;
import com.Arth.Entity.DoctorDocumentsEntity;
import com.Arth.Entity.DoctorEntity;
import com.Arth.Entity.Ratetype;
import com.Arth.Repositry.DepartmentRepositry;
import com.Arth.Repositry.DoctorDocumentsRepositry;
import com.Arth.Repositry.DoctorRepositry;

@Controller
public class DoctorDocumentsController {
	
	@Autowired
	DoctorDocumentsRepositry repositry;
	
	@Autowired
	DoctorRepositry dRepositry;
	
	@GetMapping("/docdoctor")
	public String docdoctor1(Model model) {
		
		List<DoctorEntity> dname= dRepositry.findAll();
		model.addAttribute("dname",dname);
			
		
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
