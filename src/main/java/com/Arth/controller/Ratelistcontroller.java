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
import com.Arth.Entity.ratelistEntity;
import com.Arth.Repositry.DepartmentRepositry;
import com.Arth.Repositry.MaterialRepositry;
import com.Arth.Repositry.PackageRepositry;
import com.Arth.Repositry.RatelistRipositry;
import com.Arth.Repositry.RatetypeRipositry;
import com.Arth.dto.ratelistdto;

@Controller
public class Ratelistcontroller {

	@Autowired
	RatelistRipositry repositry;

	@Autowired
	RatetypeRipositry raterepo;

	@Autowired
	DepartmentRepositry drepositry;

	@GetMapping("/ratelist")
	public String ratelist(Model model) {

		List<Ratetype> ratetype = raterepo.findAll();
		model.addAttribute("ratetype", ratetype);

		List<DepartmentEntity> department = drepositry.findAll();
		model.addAttribute("department", department);

		return "/ratelist";

	}

	@PostMapping("/ratelists")
	public String saveratelist(ratelistEntity ratelist) {
		repositry.save(ratelist);
		return "redirect:/ratelistlist";
	}

	@GetMapping("/ratelistlist")
	public String ratelistlist(Model model) {
		List<ratelistdto> ratelistlist = repositry.FindByratelistId();
		model.addAttribute("ratelist", ratelistlist);

		return "/ratelistlist";
	}

	@GetMapping("/deleteratelist")
	public String deleteratelist(@RequestParam("id") Integer ratelistId) {

		repositry.deleteById(ratelistId);

		return "redirect:/ratelistlist";
	}

	@GetMapping("/Editratelist")
	public String Editratelist(@RequestParam("id") Integer ratelistId, Model model) {

		ratelistEntity ratelist = repositry.findById(ratelistId).get();
		model.addAttribute("ratelist", ratelist);

		List<Ratetype> ratetype = raterepo.findAll();
		model.addAttribute("ratetype", ratetype);

		List<DepartmentEntity> department = drepositry.findAll();
		model.addAttribute("department", department);

		return "Editratelist";
	}

}
