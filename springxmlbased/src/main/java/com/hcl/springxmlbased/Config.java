package com.hcl.springxmlbased;

public class Config 
{
	private String engine;
	private int airbag;
	
	public Config() 
	{
		System.out.println("Inside default constructor");
	}

	public Config(String engine, int airbag) {
		super();
		this.engine = engine;
		this.airbag = airbag;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getAirbag() {
		return airbag;
	}

	public void setAirbag(int airbag) {
		this.airbag = airbag;
	}
	
}
