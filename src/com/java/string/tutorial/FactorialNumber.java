package com.java.string.tutorial;

public class FactorialNumber {

	// fact of 3 = 3*2*1 =6
	// fact of 4 = 4*3*2*1=24
	// fact of 5 = 5* 4*3*2*1==120
	// fact of 1 and 0 =1

	// simple forLoop (without recursive)

	public static int factorial(int num) {
		int fact = 1;
		if(num==1 || num==0) {
			return 1;
		}
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	
	// recursive function 
	
	public  static int factrecurive(int num) {
		if(num==0)
			return 1;
		else
			return(num * factrecurive(num-1));
	}
	public static void main(String[] args) {

	//	System.out.println("Factorial of 5 is :" + factorial(0));
		System.out.println("Factorial of 5 is :" + factrecurive(5));
	}

}
