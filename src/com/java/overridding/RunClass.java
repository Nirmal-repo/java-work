package com.java.overridding;

public class RunClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperClass superclass =  new SuperClass();
		SubClass subclass = new SubClass();
		
		
	 
		
		
		superclass.displayMsg();
		subclass.displayMsg();
		
		SuperClass supersubclass = new SubClass();
		 
		 supersubclass.displayMsg();

	}

}
