package com.bridgelabz.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		// spellchecker constructor will get call at the time of bean creation.
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWireBeans.xml");

		TextEditor te = (TextEditor) context.getBean("textEditor");
		System.out.println(te.getName());

		// spellcheck method inside TextEditor will call the method of
		// SpellChecker class
		te.spellCheck();
	}
}