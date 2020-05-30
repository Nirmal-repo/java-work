package com.java.string.tutorial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	static String[] names = { "Java", "JavaScripts", "c", "c++", "Java", "Ruby", "c", "c" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******** using normal method O(n*n)  *************");
		// 1.compare each element [worst solution ]
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equalsIgnoreCase(names[j])) {
					System.out.println("Duplicate element is :" + names[i]);
				}

			}
		}

		// 2.using HashSet - HashSet is a part of Java collection and it stores only
		// unique value;
		System.out.println("******** using HashSet O(n) *************");
		Set<String> stores = new HashSet<String>();
		for (String name : names) {
			if (stores.add(name) == false) {
				System.out.println("duplicate element is :" + name);
			}
		}

		// 3.using Hashmap
		System.out.println("***********using Hashmap*************");
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}

		}

		// get the value from HashMap
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("duplicate elemnt using hasmap is :" + entry.getKey());
				System.out.println("duplicate element count is :" + entry.getValue());
			}
		}

	}

}
