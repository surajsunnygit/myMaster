package com.example.demo;

import java.math.BigInteger;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/RegistrationController")
@RestController
public class Controller {

	@Autowired
	RegistrationServiceImplementation serviceclass;
	
	@GetMapping(path = "/saveRegistration")
	public Registration saveRegistration() {
		Registration registration = new Registration();
		registration.setUserName("suraj");
		registration.setPassword("suraj");
		registration.setMail("suraj.thatipally@gmail.com");
		registration.setGender("Male");
		return serviceclass.save(registration);
	}	
	
		@GetMapping(path="/findbyusernameandpassword/{uname}")
		public String findbyusername(@PathParam("uname") String uname) {
		return  "existing user"+serviceclass.findbyusername(uname);
		}
		
		@GetMapping(path="/NumberOfUsers")
		public BigInteger NumberOfUsers() {
		return serviceclass.NumberOfUsers();
		}
		
	
}
