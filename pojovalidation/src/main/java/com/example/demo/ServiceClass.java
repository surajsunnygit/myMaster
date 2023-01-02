package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass 
{
	@Autowired
	ServiceInterface serviceInterface;

	public void save(Car car) {
		// TODO Auto-generated method stub
		serviceInterface.save(car);
	}
	
	
}
