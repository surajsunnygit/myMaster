package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@org.springframework.web.bind.annotation.RestController
@RequestMapping("/checkcontroller")
public class RestController 
{

	@RequestMapping("/greet")
	public String greet() {
		return "hi"+"check.jsp";
	}
}
