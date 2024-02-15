package com.Arth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arth.Entity.AppointmentStatusEntity;
import com.Arth.Entity.DepartmentEntity;
import com.Arth.Repositry.AppoinmentStatusRepositry;
import com.Arth.Repositry.DepartmentRepositry;

@Controller
public class AppoinmentStatusController {
	
	@Autowired
	AppoinmentStatusRepositry repositry;
	
	@GetMapping("/appoimentstatus")
	public String appoimentstatus() {
		return "/AppoinmentStatus";
	}
	
	@PostMapping("/saveappoimentstatus")
	public String home(AppointmentStatusEntity appoinment) {
		repositry.save(appoinment);
		return "redirect:/AppoinmentStatuslist";
	}
	

	@GetMapping("/AppoinmentStatuslist")
	public String departmentlist(Model model) {
		List<AppointmentStatusEntity> apstatus = repositry.findAll();
		 model.addAttribute("apstatus",apstatus);
		
		return "/AppoinmentStauslist";
	}
	
	@GetMapping("/deleteappoinmentstatus")
	public String deleteAppoinmentstatus(@RequestParam("id") Integer appoinmentStatusId ) {
		
		   repositry.deleteById(appoinmentStatusId );
		
		return "redirect:/AppoinmentStatuslist";
	}

}
