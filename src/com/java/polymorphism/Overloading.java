package com.java.polymorphism;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj1 = new Overloading();
		obj1.add(45, 45);
		obj1.add(3, 5, 6);
		
		obj1.add(2.0,3.4);
	}

	
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Sum of two no..."+c);
	}
	
	public void add(int a,int b, int c) {
		int d=a+b+c;
		System.out.println("Sum of three no..."+d);
	}
	
	public void add(double a,double b) {
		double c=a+b;
		System.out.println("Sum of two no..."+c);
	}


}
