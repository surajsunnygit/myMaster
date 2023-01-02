package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface IEmployeeService {

	public void save(Employee employee);
}
