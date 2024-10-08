package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.patientEntity;
import com.Arth.Entity.patientItemEntity;
import com.Arth.Repositry.IteamRepositry;
import com.Arth.Repositry.patientItemRepositry;
import com.Arth.Repositry.patientrepositry;
import com.Arth.dto.patientItemdto;

import jakarta.servlet.http.HttpSession;

@Controller
public class patientItemsController {

	@Autowired
	IteamRepositry itemRepo;

	@Autowired
	patientrepositry patientrepo;

	@Autowired
	patientItemRepositry patientitemRepo;

	@GetMapping("addpatientitem")
	public String addpatientitem(Model model) {

		List<IteamEntity> item = itemRepo.findAll();
		model.addAttribute("item", item);

		List<patientEntity> patient = patientrepo.findAll();
		model.addAttribute("patient", patient);

		return "patientItem";
	}

	/*
	 * 
	 * @PostMapping("/savepatientitem") public String
	 * savePatientItems(@ModelAttribute("patientItem") patientItemEntity[]
	 * patientItems) { // Iterate through the array of patient items and save each
	 * one for (patientItemEntity patientItem : patientItems) {
	 * patientitemRepo.save(patientItem); } return "redirect:/patientItemlist"; }
	 * 
	 */

	@PostMapping("/savepatientitem")
	public String savePatientItems(@RequestParam("patientId") Integer patientId, @RequestParam("date") String date,
			@RequestParam("totalPrice[]") Float[] totalPrice, @RequestParam("itemIds[]") Integer[] itemIds,
			@RequestParam("qty[]") Integer[] quantities, Model model) {

		// Iterate through the selected item IDs and save each one with its quantity
		for (int i = 0; i < itemIds.length; i++) {
			patientItemEntity patientItem = new patientItemEntity();
			patientItem.setPatientId(patientId);
			patientItem.setItemId(itemIds[i]);
			patientItem.setDate(date);
			patientItem.setQty(quantities[i]); // Use corresponding quantity for each item
			patientItem.setTotalPrice(totalPrice[i]);
			patientitemRepo.save(patientItem);
		}

		return "redirect:/patientItemlist"; // Redirect to a success page or another endpoint
	}

	@GetMapping("patientItemlist")
	public String patientItemlist(Model model) {

		List<patientItemdto> patientItem = patientitemRepo.findByPatientItemlist();

		model.addAttribute("patientItem", patientItem);

		return "patientItemlist";
	}
	
}
