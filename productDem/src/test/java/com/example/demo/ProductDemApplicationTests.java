package com.example.demo;

import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootTest
class ProductDemApplicationTests {
	@Autowired
	RegistrationServiceImplementation serviceclass;
	
	@Test
	void contextLoads() {
	}

	
	
	
	
	@Test
	public void NumberOfUsersTest() {
		BigInteger num = serviceclass.NumberOfUsers();
		assertTrue(num.signum()==1);
	}
}
