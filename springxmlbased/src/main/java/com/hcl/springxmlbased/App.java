package com.hcl.springxmlbased;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/hcl/springxmlbased/XmlConfig.xml");
    	Car car = (Car) context.getBean("car");
		System.out.println(car.getCarBrand() + " " + car.getCarColor());
		System.out.println(car.getConfig().getEngine());
		
		System.out.println(car);
		System.out.println(car.getConfig());
		System.out.println(car.getConfig());
		System.out.println();
		
		Config config= (Config) context.getBean("config");
		Config config1= (Config) context.getBean("config");
		System.out.println();
		System.out.println(config);
		System.out.println(config1);
		
		context.registerShutdownHook();
	}
    
}

