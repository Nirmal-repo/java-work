package com.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashMap<Integer,String> map = new HashMap<Integer ,String>();
		map.put(1, "Selenium");
		map.put(2, "Java");
		map.put(3, "C++");
		map.put(4, "QTP");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
	System.out.println(map.get(3));
	System.out.println(map.get(4));
	
	
	
	for(Entry m:map.entrySet()) {
		
		System.out.println(m.getKey()+"==========="+m.getValue());
		
		
	
	}
	
	HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
	
	Employee e1 = new Employee("Nirmal",23,"QA");
	Employee e2 = new Employee("Vikas",39,"Dev");
	Employee e3 = new Employee("Arihand",20,"Support");
	Employee e4 = new Employee("Vihaan",38,"Admin");
	
	emp.put(1, e1);
	emp.put(2, e2);
	emp.put(3, e3);
	emp.put(4, e4);
	
for(Entry<Integer,Employee> m:emp.entrySet()) {
	
	  int key = m.getKey();
	  Employee e =m.getValue();
	  
	  System.out.println(key + ":: Info ");
	  System.out.println(e.name+":"+e.age+":"+e.dept);
	
	}
	
	
}
	
}
