package com.hcl.springdemo;

public class Address {
private String city;
private String state;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

public void init() {
	System.out.println("Inside init method");
}

public void destroy() {
	System.out.println("Inside destroy method");
}

}
