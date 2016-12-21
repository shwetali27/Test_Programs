package com.bridgelabz.SpringStandalone;

public class HelloWorld2 {
	private String message;

	/*--injection using constructor-arg--*/
	public HelloWorld2(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("HelloWorld2 : " + message);
	}
	
	public void init(){
		System.out.println("helloworld2 Bean is getting initialized");
	}
	
	public void destroy(){
		System.out.println("helloworld2 Bean is destroyed");
	}
}