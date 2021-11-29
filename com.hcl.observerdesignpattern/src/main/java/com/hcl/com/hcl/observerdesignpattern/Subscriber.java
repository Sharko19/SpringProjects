package com.hcl.com.hcl.observerdesignpattern;

public class Subscriber 
{
	private String name;
	private Channel channel= new Channel();

	public void update() 
	{
		System.out.println("Hey " + name + ", Video uploaded : " +channel.title+"");
	}
	
	public void subscribeChannel (Channel ch)
	{
		channel = ch;
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}
		
	
}
