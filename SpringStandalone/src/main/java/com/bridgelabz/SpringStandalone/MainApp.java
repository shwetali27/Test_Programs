package com.bridgelabz.SpringStandalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		System.out.println("------------------------------------");
		/*----"helloWorld" is bean id as defined in xml file----*/
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getMessage1();
		helloWorld.getMessage2();
		System.out.println();

		/*---helloIndia is child bean of helloWorld bean---*/
		HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
		helloIndia.getMessage1();
		helloIndia.getMessage2();
		helloIndia.getMessage3();
		System.out.println();

		/*----- setting values using cnstructor-arg -----*/
		HelloWorld2 helloWorld2 = (HelloWorld2) context.getBean("helloWorld2");
		helloWorld2.getMessage();

		// after calling this destroy method will get called
		((AbstractApplicationContext) context).registerShutdownHook();

	}
}