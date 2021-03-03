package com.hello.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hello() {
		System.out.println("Hello "+this.name);
	}
	
}
