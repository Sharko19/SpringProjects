package com.hcl.springdemo;

public class Employee {

private Address address;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [address=" + address + "]";
}

}
