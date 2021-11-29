package com.hcl.springjavabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig 
{

	@Bean(name="carObj")
	public Car getCar1() 
	{
		return new Car("BMW");
	}
}
