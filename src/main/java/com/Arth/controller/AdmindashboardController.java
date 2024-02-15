package com.Arth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdmindashboardController {
	
	@GetMapping("/Admindashboard")
	public String Admindashboard() {
		return "/AdminDashboard";
	}

}
