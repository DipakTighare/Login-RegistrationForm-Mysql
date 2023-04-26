package com.dipak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dipak.entity.Employee;
import com.dipak.repository.EmployeeRepository;

@Controller
public class RegisterController {
   @Autowired
	private EmployeeRepository repo;
	
	@GetMapping("/register")
	public String register() {
		
		return "register";
		
	}
	@RequestMapping("/registerProcess")
	public String register(@ModelAttribute("employee") Employee employee,Model theModel) {
		
		
		theModel.addAttribute("user",employee);
		repo.save(employee);
		
		
		return "success";
		
	}
}
