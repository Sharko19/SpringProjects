package com.hcl.javaannotationbased;

import org.springframework.stereotype.Component;

@Component
public class Mpfi implements Engine 
{
	public void rotate() 
	{
		System.out.println("Most Advance MPFI Engine that rotates at 1000 RPM");
	}
}
