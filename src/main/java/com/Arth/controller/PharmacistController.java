package com.Arth.controller;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.AppoinmentEntity;
import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.PharmistEntity;
import com.Arth.Entity.patientItemEntity;
import com.Arth.Repositry.IteamRepositry;
import com.Arth.Repositry.PharmacistRepositry;
import com.Arth.Repositry.patientItemRepositry;
import com.Arth.dto.iteamdto;

@Controller
public class PharmacistController {

	@Autowired
	PharmacistRepositry pharmRepo;

	@Autowired
	IteamRepositry itemrepo;

	@Autowired
	patientItemRepositry patientitemRepo;

	@GetMapping("AddPharmacist")
	public String Pharmacist() {

		return "Pharmacist";

	}

	@GetMapping("PharmacistDashbaord")
	public String PharmacistDashbaord(Model model) {

		LocalDate localDate = LocalDate.now();
		Integer month = localDate.getMonth().getValue();

		List<IteamEntity> items = itemrepo.findAll();

		model.addAttribute("items", items);

		Integer nextmonthexpireiteams = itemrepo.getCurruntMonthexpireiteams(month);
		model.addAttribute("nextmonthexpireiteams", nextmonthexpireiteams);

		return "PharmacistDashbaord";
	}

	@PostMapping("savepharmacist")
	public String savepharmacist(PharmistEntity pharmEntity) {

		pharmEntity.setRoleId(7);
		pharmRepo.save(pharmEntity);

		return "redirect:/Pharmacistlist";
	}

	@GetMapping("Pharmacistlist")
	public String Pharmacistlist(Model model) {

		List<PharmistEntity> pharmacistlist = pharmRepo.findAll();
		model.addAttribute("pharmacistlist", pharmacistlist);

		return "Pharmacistlist";
	}

	@GetMapping("Pharmacistitemslist")
	public String Pharmacistitemslist(Model model) {

		List<IteamEntity> iteam = itemrepo.findAll();

		model.addAttribute("iteam", iteam);

		return "Pharmacistitemslist";
	}

	@GetMapping("UpcomingExpireditemspharmacist")
	public String UpcomingExpireditem(Model model) {

		LocalDate l = LocalDate.now();
		Integer month = l.getMonth().getValue();

		List<iteamdto> product = itemrepo.getupcommingMonthitems(month);
		model.addAttribute("product", product);

		return "UpcomingExpireditemspharmacist";
	}

	@GetMapping("pharmistpatientlist")
	public String pharmistpatientlist(Model model) {

		//List<patientItemEntity> patientItems = patientitemRepo.findByuniqpatientId();
		
		
		List<patientItemEntity> patientItems = patientitemRepo.findAll();
		
		

		// model.addAttribute("patientItem",patientItem);

		model.addAttribute("patientItem", patientItems);

		return "pharmistpatientlist";
	}

	@GetMapping("viewpatientitems")
	public String viewpatientitem(@RequestParam("id") Integer patientId, Model model) {

		List<patientItemEntity> patient = patientitemRepo.findByPatientId(patientId);
		model.addAttribute("patient", patient);

		System.out.println(patient);

		return "viewpatientitem";
	}

}
