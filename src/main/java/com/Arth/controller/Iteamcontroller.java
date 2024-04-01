package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.IteamEntity;
import com.Arth.Entity.MaterialEntity;
import com.Arth.Repositry.IteamRepositry;
import com.Arth.Repositry.MaterialRepositry;
import com.Arth.dto.iteamdto;

@Controller
public class Iteamcontroller {

	@Autowired
	IteamRepositry repositry;

	@Autowired
	MaterialRepositry mRepositry;

	@GetMapping("/iteampage")
	public String iteamPage(Model model) {
		List<MaterialEntity> materialName = mRepositry.findAll();
		model.addAttribute("materialName", materialName);
		return "/iteam";
	}

	@PostMapping("/addItem")
	public String addItem(IteamEntity iteam) {
		repositry.save(iteam);
		return "redirect:/iteamlist";
	}

	@GetMapping("/iteamlist")
	public String departmentlist(Model model) {
		List<iteamdto> iteam = repositry.findByAllitem();
		model.addAttribute("iteam", iteam);
		return "/iteamlist";
	}

	@GetMapping("/deleteiteam")
	public String deleteiteam(@RequestParam("id") Integer itemId) {

		repositry.deleteById(itemId);

		return "redirect:/iteamlist";
	}

	@GetMapping("/Edititeam")
	public String Edititeam(@RequestParam("id") Integer itemId, Model model) {

		IteamEntity item = repositry.findById(itemId).get();
		model.addAttribute("item", item);

		List<MaterialEntity> materialName = mRepositry.findAll();
		model.addAttribute("materialName", materialName);

		return "Edititem";
	}

}
