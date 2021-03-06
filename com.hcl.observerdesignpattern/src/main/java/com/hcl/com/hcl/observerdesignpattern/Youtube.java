package com.hcl.com.hcl.observerdesignpattern;

public class Youtube {

	public static void main(String[] args) 
	{
		Channel texacademy = new Channel();
		
		Subscriber s1 = new Subscriber("Ram");
		Subscriber s2 = new Subscriber("Sam");
		Subscriber s3 = new Subscriber("Ali");
		Subscriber s4 = new Subscriber("Ria");
		Subscriber s5 = new Subscriber("Raj");

		texacademy.subscribe(s1);
		texacademy.subscribe(s2);
		texacademy.subscribe(s3);
		texacademy.subscribe(s4);
		texacademy.subscribe(s5);
		
		texacademy.unSubscribe (s3);
		
		s1.subscribeChannel(texacademy);
		s2.subscribeChannel(texacademy);
		s3.subscribeChannel(texacademy);
		s4.subscribeChannel(texacademy);
		s5.subscribeChannel(texacademy);
		
		texacademy.upload("Lets learn 'Observer' design pattern");
	}

}
