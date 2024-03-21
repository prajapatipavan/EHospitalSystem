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
import com.Arth.Entity.packageEntity;
import com.Arth.Repositry.DepartmentRepositry;
import com.Arth.Repositry.PackageRepositry;
import com.Arth.Repositry.RatetypeRipositry;

@Controller
public class packagecontroller {

	@Autowired
	PackageRepositry repositry;
	@Autowired
	RatetypeRipositry raterepositry;

	@GetMapping("/package")
	public String packagee(Model model) {

		List<Ratetype> ratetyep = raterepositry.findAll();
		model.addAttribute("ratetype", ratetyep);
		return "/package";

	}

	@PostMapping("/savePackage")
	public String home(packageEntity packagee) {
		repositry.save(packagee);
		return "redirect:/packagelist";
	}

	@GetMapping("/packagelist")
	public String departmentlist(Model model) {
		List<packageEntity> packagee = repositry.findAll();
		model.addAttribute("packagee", packagee);

		return "/packagelist";
	}

	@GetMapping("/deletepackage")
	public String deletepackage(@RequestParam("id") Integer packageId) {

		repositry.deleteById(packageId);

		return "redirect:/materiallist";
	}

	@GetMapping("/Editpackage")
	public String Editpackage(@RequestParam("id") Integer packageId, Model model) {

		packageEntity packagee = repositry.findById(packageId).get();
		model.addAttribute("packagee", packagee);

		List<Ratetype> ratetyep = raterepositry.findAll();
		model.addAttribute("ratetype", ratetyep);

		return "Editpackage";
	}

}
