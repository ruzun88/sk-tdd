package com.sk.tdd.hello;

public class HelloWorld {

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World";
	}
	
	public String getMessage(String name) {
		if (name == null) {
			name = "World";
		}
		return "Hello " + name;
	}
}
