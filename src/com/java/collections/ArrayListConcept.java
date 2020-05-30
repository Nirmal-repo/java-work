package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept
{
	public static void main(String[] args) {
		
	// dynamic array 
	//1 . duplicate entry allow 
    //2. Maintain insertion order
    //3. Not synchronized and due to this its slow
	//4. allow us to random access to fetch the element, because it store the value at the index	
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		arrayList.add(70);
	

		
		//size of the array list
		System.out.println("size of the array list is :"+arrayList.size());
		
		System.out.println("Element of 3rd index is "+ arrayList.get(3));
		
		//print all the values ..... 
		
		//1.Loop
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));}
		
		
		System.out.println("Using iterator");
		//2. Itetrator 
		Iterator itr = arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(10);
		ar.add("ram");
		
		System.out.println(ar.get(0));
	    System.out.println((ar.get(1)));
	    
	    ArrayList<Employee> emp = new ArrayList<Employee>();
	   
	    Employee e1 = new Employee("Nirmala",23,"QA");
		Employee e2 = new Employee("Vikasa",39,"Dev");
		Employee e3 = new Employee("Arihanda",20,"Support");
		Employee e4 = new Employee("Vihaana",38,"Admin");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		System.out.println("print all employee data using for loop ");
		
		for(int i=0;i<emp.size();i++) {
			System.out.println("Employee index["+i+"] :" + emp.get(i).age + emp.get(i).name+emp.get(i).dept);
		}
		
		System.out.println("**************************");
		

		System.out.println("print all employee data using for itrrator ");
		
		Iterator<Employee>eit = emp.iterator();
		while(eit.hasNext()) {
			
			 Employee empDetail = eit.next();
			 System.out.println("Name===========>"+empDetail.name+ "   Age===========>"+empDetail.age+"  Dept===========>"+empDetail.dept);
			
		}
		
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ArrayList<String> ar2= new ArrayList<String>();
		ar1.add("ram");
		ar1.add("sita");
		ar1.add("laxman");
		ar1.add("distroy and Kill");
		
		System.out.println(" Array list Ar1 :"+ar1);
		
		ar2.add("Krisnah");
		ar2.add("Balram");
		ar2.add("mathura");
		ar2.add("distroy and Kill");
		
		System.out.println(" Array list Ar2 :"+ar2);
		
		System.out.println("common item/s is/are :"+ar1.retainAll(ar2));
		
		for(int j=0;j<ar1.size();j++) {
			System.out.println("Common list is :"+ar1.get(j));
		}
	}
}
