package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService
{
	@Autowired
	EmployeeDaoImpl daoimpl;

	@Override
	public void save(Employee employee) {
		daoimpl.save(employee);
	}
	
}
