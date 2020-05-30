package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Ram");
		linkedlist.add("Selenium");
		linkedlist.add("Java");
		linkedlist.add("C");
		linkedlist.add("Bhakar");
		System.out.println("content of linked list :"+linkedlist);
		
		linkedlist.addFirst("Vihaan");
		System.out.println("content of linked list :"+linkedlist);
		linkedlist.addLast("Nirmal");
		System.out.println("content of linked list :"+linkedlist);
		


		
		
		System.out.println("content of linked list :"+linkedlist);
		System.out.println("************ Using For Loop.***************");
		//for loop 
		for(int i=0; i<linkedlist.size();i++) {
			System.out.println(linkedlist.get(i));
		}
		
		System.out.println("************ Using itetrator.***************");
		Iterator<String> itr = linkedlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
