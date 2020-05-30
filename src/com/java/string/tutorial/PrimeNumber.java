package com.java.string.tutorial;

public class PrimeNumber {
	
	static int num=24;
	
	static int m=num/2;
	
	static boolean flag=false;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for non-prime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

	

}
