package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping
	public void create(@RequestBody Employee employee) {
	
		service.save(employee);
		
	}
}
