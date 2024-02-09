package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("/savematerial")
	public String savematerial(MaterialEntity material) {
		mrepositry.save(material);
		return "redirect:/materiallist";
	}
	

	@GetMapping("/materiallist")
	public String materialistl(Model model) {
		List<MaterialEntity> material = mrepositry.findAll();
		 model.addAttribute("material",material);
		
		return "/materiallist";
	}
	

}
