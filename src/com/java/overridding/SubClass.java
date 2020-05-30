package com.java.overridding;

public class SubClass extends SuperClass {
	
	int a=20;
	
	public void displayA() {
		System.out.println("A is :"+a);
	}
	
	public void displayMsg() {
		System.out.println("I am from the sub class");
	}

}
