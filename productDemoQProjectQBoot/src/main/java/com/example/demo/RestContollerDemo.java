package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ProductController")
@RestController
public class RestContollerDemo {

	@Autowired
	DaoController controller;
	
	@PostMapping("/add")
	public void addProduct()
	{
		System.out.println("hi");
		Car product = new Car();
		product.setPid(1);
		product.setName("laptop");
		controller.save(product);
		System.out.println("hello");
	}
	
	@GetMapping(path="/getAllProducts",produces = "application/json")
	public List<Car> getAllProducts(){
		System.out.println(controller.findAll());
		return controller.findAll();
	}
	
	@GetMapping(path="/findById/{id}",produces = "application/json")
	public Optional<Car> findById(@PathParam(value = "id") int id){
		System.out.println(controller.findById(id));
		return controller.findById(id);
	}
}
