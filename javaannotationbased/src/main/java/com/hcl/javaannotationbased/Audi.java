package com.hcl.javaannotationbased;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Audi 
{
	@Autowired
	//@Qualifier("mpfi")
	Engine engine;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void config()
	{
	System.out.println("Automatic car, petrol");
	engine.rotate();
	}
}