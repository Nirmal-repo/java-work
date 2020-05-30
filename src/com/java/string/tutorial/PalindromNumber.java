package com.java.string.tutorial;

public class PalindromNumber {

	
	public static void isPalindromNumber(int number) {
		
		int r=0;
		int sum=0;
		int temp=0;
		
	    temp=number;
	    while(number>0) {
	     r=	number%10;
	     sum =(sum*10)+r;
	     number=number/10;
	    }
	   
	    if(temp==sum) {
	    	System.out.println("Palindrom number");
	    }
	    else {
	    	System.out.println("Not Palindrom Number");
	    }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
          isPalindromNumber(152);
	}

}
