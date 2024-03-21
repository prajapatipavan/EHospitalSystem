package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.DepartmentEntity;
import com.Arth.Entity.MaterialEntity;
import com.Arth.Repositry.DepartmentRepositry;
import com.Arth.Repositry.MaterialRepositry;

@Controller
public class Materialcontroller {

	@Autowired
	MaterialRepositry mrepositry;

	@GetMapping("/material")
	public String material() {
		return "/material";
	}

	@PostMapping("/addmeterial")
	public String savematerial(MaterialEntity material) {
		mrepositry.save(material);
		return "redirect:/materiallist";
	}

	@GetMapping("/materiallist")
	public String materialistl(Model model) {
		List<MaterialEntity> material = mrepositry.findAll();
		model.addAttribute("material", material);

		return "/materiallist";
	}

	@GetMapping("/deletematerial")
	public String deletematerial(@RequestParam("id") Integer materialId) {

		mrepositry.deleteById(materialId);

		return "redirect:/materiallist";
	}

	@GetMapping("/Editmaterial")
	public String Editmaterial(@RequestParam("id") Integer materialId, Model model) {

		MaterialEntity material = mrepositry.findById(materialId).get();

		model.addAttribute("material", material);

		return "Editmaterial";
	}

}
