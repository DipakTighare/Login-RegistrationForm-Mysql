package com.dipak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipak.entity.Employee;
import com.dipak.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public Employee login(String loginId,String password) {
		
		Employee employee=repository.findByLoginIdAndPassword(loginId,password);
				
				return employee;
	}
	
	
}
