package com.java.oopconcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// complile time polymorphism : At the time of compilation jva will decide which method needs to be called
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();

		System.out.println("******************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
	   
		
		Car c1 =new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
	}

}
