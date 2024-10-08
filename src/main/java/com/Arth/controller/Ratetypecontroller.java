package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.DepartmentEntity;
import com.Arth.Entity.Ratetype;

import com.Arth.Repositry.RatetypeRipositry;

@Controller
public class Ratetypecontroller {

	@Autowired
	RatetypeRipositry repositry;

	@GetMapping("/ratetype")
	public String department() {
		return "/ratetype";

	}

	@PostMapping("/saveRateType")
	public String home(Ratetype ratetype) {
		repositry.save(ratetype);
		return "redirect:/ratetypelist";
	}

	@GetMapping("/ratetypelist")
	public String retetypelist(Model model) {
		List<Ratetype> ratetype = repositry.findAll();
		model.addAttribute("ratetype", ratetype);

		return "/ratetypelist";
	}

	@GetMapping("/deleteratetype")
	public String deleteratetype(@RequestParam("id") Integer ratelistId) {

		repositry.deleteById(ratelistId);

		return "redirect:/ratetypelist";
	}

	@GetMapping("/Editratetype")
	public String Editratetype(@RequestParam("id") Integer ratelistId, Model model) {

		Ratetype ratetype = repositry.findById(ratelistId).get();
		model.addAttribute("ratetype", ratetype);

		return "Editratetype";
	}

}
