package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Car {

	@Id
	@NotNull
	private int carId;
	
	@NotNull
	@Size(min = 4,message = "carBrand length cannot be less than 4")
	@Size(max = 10,message = "carBrand length cannot be greater than 10")
	private String carBrand;
	
	@NotNull
	@Size(min = 3,message = "car color length cannot be less than 3")
	@Size(max = 10,message = "car color length cannot be greater than 10")
	private String color;

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carBrand=" + carBrand + ", color=" + color + "]";
	}
	
	
}
