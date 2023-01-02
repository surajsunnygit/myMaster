package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IDaoController extends JpaRepository<Car, Integer>
{

}
