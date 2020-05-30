package com.java.collections;

import java.util.HashSet;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> values = new HashSet<String>();
		values.add("ram");
		values.add("1");
		
		values.add("nijlda");
		
		values.add("Slenium");
		values.add("Slenium");
		
		values.add("r1243Selam");
		
		System.out.println(values);
		for(String e:values) {
			System.out.println(e);
		}
		
		
		
	}

}
