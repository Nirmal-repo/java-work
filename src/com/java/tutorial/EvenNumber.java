package com.java.tutorial;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n,j,even=0;
   
		Scanner sc =new Scanner(System.in);
		
		ArrayList <Integer> ls= new ArrayList<Integer>();
		
		n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			j=sc.nextInt();
			if(j%2==0)
			{
				even++;
			}
			
			ls.add(j);
		}
		
		System.out.println("List of array is :"+ls);
	
        System.out.println("Even number is :"+even);		

	}

}
