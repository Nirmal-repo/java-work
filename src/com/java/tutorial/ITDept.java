package com.java.tutorial;

public abstract class ITDept implements Employee{

	@Override
	public abstract void salary() ;

	@Override
	public void goodies() {
		// TODO Auto-generated method stub
		
		System.out.println("I got laptop");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
		System.out.println("I am Automation Engineer");
	}
	

}
