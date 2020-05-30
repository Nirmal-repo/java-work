package com.java.tutorial;

public class HRTeam extends ITDept {
	
	public static void main(String[] args) {
		
		//1st  scenairo
		HRTeam hr = new HRTeam();
		hr.goodies();
		hr.work();
		hr.salary();
		hr.bonus();
		
		//2nd Scenario
		
		ITDept it= new HRTeam();
		it.goodies();
		it.work();
		
		
	   // 3rd Scenaio 
		
      
		
		
	}
	public void salary() {
		// TODO Auto-generated method stub
		
		System.out.println("I got Salary of $30000.00");
		
	}
	
	public void bonus() {
		System.out.println("Bonus is : $50000");
	}

}
