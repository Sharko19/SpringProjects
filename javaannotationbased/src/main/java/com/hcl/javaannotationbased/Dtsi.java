package com.hcl.javaannotationbased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dtsi implements Engine 
{

	public void rotate() 
	{
		System.out.println("Most Advance DTSI Engine rotates at 900 RPM");
	}

}
