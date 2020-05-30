package com.java.tutorial;

public class ChildClass extends ParentClass {
	
	public void ChildClass()
	{
		System.out.println("I am from Child constructor");
	}
	
	  public  void Display(){
		   
		  System.out.println("I am from Child class");
  

	   }
	
	  public static void DisplayTwo()
		 {
			 System.out.println("I am from Child  class Display method 2");
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass childObject = new ChildClass();
		ParentClass parentObject = new ChildClass();
		
		
		
		
	 System.out.println("Child class Object ");	
		childObject.Display();
		childObject.Parentclass();
		childObject.DisplayTwo();
		System.out.println("\n");	
		
	 System.out.println("Parent class Object ");	
	 parentObject.Display();
	 parentObject.Parentclass();
	 parentObject.DisplayTwo();

	}

}
