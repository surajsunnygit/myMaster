package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carRestController")
public class RestCotroller {

	@Autowired
	private ServiceClass service;
	
	@PostMapping("/create")
	public void create() {
		Car car = new Car();
		car.setCarId(1);
		car.setCarBrand("aud");
		car.setColor("black");
		service.save(car);
	}
}
