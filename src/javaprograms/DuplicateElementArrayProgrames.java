package javaprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementArrayProgrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        String[] languages= {"Java","C","C++","Java","Python","C"};
        
		/*
		 * // Using HashSet
		 * 
		 * Set<String> langSet = new HashSet<String>();
		 * 
		 * for(String lang:languages) {
		 * 
		 * if(langSet.add(lang)==false) {
		 * System.out.println("Given string is duplicate"+lang); }
		 * 
		 * }
		 */
        
        
        //Using HashMap : Find the count of duplicate Element as well 
        
        Map<String,Integer> dupMap= new HashMap<String,Integer>();
        for(String langs:languages) {
        	Integer count=dupMap.get(langs);
        	if(count==null) {
        		dupMap.putIfAbsent(langs, 1);
        	}
        	else {
        		dupMap.putIfAbsent(langs, ++count);
        	}
        }
        
        Set<Entry<String,Integer>> entry = dupMap.entrySet();
        
        for(Entry<String,Integer> entrySet:entry) {
        	if(entrySet.getValue()>1) {
        	
        		System.out.println("duplicate element name"+entrySet.getKey());
        		System.out.println("duplicate element value"+entrySet.getValue());
        	}
        }
        
        

	}

}
