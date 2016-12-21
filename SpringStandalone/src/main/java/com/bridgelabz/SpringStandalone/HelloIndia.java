package com.bridgelabz.SpringStandalone;

public class HelloIndia {
	String message1,message2,message3;

	/*---------------------------inherited methods of parent bean class helloWorld----------------------------*/
	public void getMessage1() {
		System.out.println("HelloIndia message1 : "+message1);
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public void getMessage2() {
		System.out.println("HelloIndia message2 : "+message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public void init(){
		System.out.println("helloIndia Bean is getting initialized");
	}
	
	public void destroy(){
		System.out.println("helloIndia Bean is destroyed");
	}
	
	/*------------------------method of helloIndia---------------------------*/
	public void getMessage3() {
		System.out.println("HelloIndia message3 : "+message3);
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}
}
