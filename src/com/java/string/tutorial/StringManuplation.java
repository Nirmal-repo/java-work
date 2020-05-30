package com.java.string.tutorial;

public class StringManuplation {
	
	static String s1 ="$45.34",s2;
	static String name="Bhaskar-India-World";
	static int digit,whitespace,otherchar;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        System.out.println("String function started....");
        
        System.out.println("Replace the $ symbol....");
        
        s2=s1.replace("$","");
        System.out.println("s2 value is ...."+s2);
        
        Double s3 = Double.parseDouble(s2);
        
        System.out.println("Double value is :"+(s3+1.2));
        
        System.out.println("Full String is :"+name);
        
         String[] splitname = name.split("-");
         
        for(int i=0;i<splitname.length;i++) {
        	System.out.println( "splitname["+i+"] : " +splitname[i]);
        	
        }

        System.out.println("Find the total count of digit in Stirng ");
       
        String strvar ="Hellow211worldCom and Bhanu pratap122";

        System.out.println("Strvar value is :;"+strvar);
        
        for(int j=0 ;j<strvar.length();j++) {
        	 
        	 char a = strvar.charAt(j);
        	 
        	 if(Character.isDigit(a)) {
        		 digit++;
        	 }else if (Character.isWhitespace(a)) {
				whitespace++;
			}  else {
				otherchar++;
			
			}

        		 
        }
        
        System.out.println("Digit Count is :"+digit);
        System.out.println("WhiteSpace Count is :"+whitespace);
        System.out.println("Othercar Count is :"+otherchar);
        
	}

}
