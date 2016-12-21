package com.bridgelabz.SpringStandalone;

public class HelloWorld {
	private String message1,message2;

	/*--injection using setter--*/
	public void setMessage1(String msg) {
		this.message1 = msg;
	}

	public void getMessage1() {
		System.out.println("HelloWorld message1: " + message1);
	}
	
	
	public void getMessage2() {
		System.out.println("HelloWorld message2 : "+message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public void init(){
		System.out.println("helloworld Bean is getting initialized");
	}
	
	public void destroy(){
		System.out.println("helloworld Bean is destroyed");
	}
}