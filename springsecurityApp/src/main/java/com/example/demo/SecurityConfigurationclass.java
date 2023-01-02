package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfigurationclass extends  WebSecurityConfigurerAdapter{

	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
	List<UserDetails> list = new ArrayList<>();
	list.add(User.withDefaultPasswordEncoder().username("suraj").password("1234").roles("USER").build());
	return new InMemoryUserDetailsManager(list);
	}

	
}
