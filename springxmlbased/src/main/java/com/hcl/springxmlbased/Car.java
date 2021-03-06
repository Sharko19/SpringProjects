package com.hcl.springxmlbased;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean, DisposableBean
{
	private String carBrand;
	private String carColor;
	private Config config;
	
	public Car() 
	{
		System.out.println("This is Default constructor");
	}
	
	public Car(String carBrand, String carColor, Config config) {
		super();
		this.carBrand = carBrand;
		this.carColor = carColor;
		this.config = config;
	}


	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}
	
	public void customInitMethod() {
		System.out.println("Inside customInitMethod");
	}
	public void customDestroyMethod() {
		System.out.println("Inside customDestroyMethod");
	}

	public void destroy() throws Exception {
		System.out.println("Inside destroy");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet");
		
	}
}
