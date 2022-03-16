package com.sk.tdd.hello;

public class HelloWorld {
	private static String helloMessage = "Hello World";
	
	public String getMessage() {
		return helloMessage;
	}
	
	public String getMessage(String name) {
		if (name == null) {
			name = "World";
		}
		return "Hello " + name;
	}
}
