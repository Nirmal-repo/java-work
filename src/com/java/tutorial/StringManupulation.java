package com.java.tutorial;

public class StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strVar="Hellow I am Nirmal Jain, I am from Delhi-India.$";
		String strVar2="HelloW I am Nirmal Jain, I am from Delhi-India.$";
		//length of the string 
		
		System.out.println("string length :"+strVar.length());
		
		//Char at speciifc index 
		
		System.out.println("Index of 6 :"+strVar.charAt(6));
		
		// Get index of  the character 
		
		System.out.println("Index of the character :"+ strVar.indexOf("a"));
		
		System.out.println("Index of the another charter :"+strVar.indexOf("a",strVar.indexOf("a")+1));
          
		System.out.println("Index of the another string :"+strVar.indexOf("am"));
		
		System.out.println("Index of Ram :"+strVar.indexOf("Ram"));
		
		// string comparision 
		
		System.out.println(strVar.equalsIgnoreCase(strVar2));
		
		//sub string 
		
		System.out.println("Sub string is :"+strVar.substring(0, 6));
		
		//trim 
		
		String s =" Hellow World ";
		System.out.println("trim string is :"+s.trim());
        
		//replace 
		System.out.println("replace metheod :"+s.replace(" ", ""));
		
		//split 
		
	    String  test  ="Hellow_World_Test_Selenium";
	    
	    System.out.println("Before split :"+test);
	    String[] tesrVal = test.split("_");
	    
	    for(int i=0;i<tesrVal.length;i++) {
	    	System.out.println("After split :"+tesrVal[i]);
	    }
	    
	    String cares ="123H";
	    
	    System.out.println("Replace with regular expression :"+cares.replaceAll("[^123]", "4"));
	    
	    String x = "Ram";
	    String y = "Sita";
	    int a=22;
	    int b=34;
	    
	    System.out.println(x+y+a+b);
	     
	    
	}

}
