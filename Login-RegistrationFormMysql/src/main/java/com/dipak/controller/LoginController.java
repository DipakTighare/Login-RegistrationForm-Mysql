package com.dipak.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dipak.entity.Employee;
import com.dipak.service.EmployeeService;

@Controller
public class LoginController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping({"/","/home"})
	public String home() {
		return "welcome";
		}

	@GetMapping("/login")
	public String login() {
		return "login";
	}	

	@RequestMapping("/loginProcess")
	public String login(@ModelAttribute("employee")Employee employee,Model model) {
		Employee authEmployee =service.login(employee.getLoginId(), employee.getPassword()) ;
		
		model.addAttribute("user",authEmployee);
		
		try {
			
			if (employee.getLoginId().equals(authEmployee.getLoginId())
				&& employee.getPassword().equals(authEmployee.getPassword())){
				
			return "success";
			}	
		} catch (Exception e) {
			
			System.out.println(e);
		}
		return "failure";
		
		
	}		
			
			
}	

