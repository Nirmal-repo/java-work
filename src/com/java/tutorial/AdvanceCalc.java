package com.java.tutorial;

public class AdvanceCalc implements Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Create the child class object ");
		AdvanceCalc obj = new AdvanceCalc();
		obj.add();
		obj.sub();
		obj.calculateSin();
		obj.calculateSin();
		
		// 2. Base class reference and child class object 
		
      
		Calculator obj2 = new AdvanceCalc();
		obj2.add();
		obj2.sub();
	}


	public void add() {
		// TODO Auto-generated method stub
		System.out.println("I am from Add method");
	}


	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("I am from  substraion method");
		
	}
	
	
	public void calculateSin() {
		
		System.out.println("I am in Advance - Sin @ method");
		
	}
	
	public void calculateCos() {
		System.out.println("I am in Advance - cos@ method");
	}

}
