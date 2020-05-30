package javaprograms;

import com.sun.org.apache.xml.internal.dtm.ref.dom2dtm.DOM2DTM.CharacterNodeHandler;

public class CountNumberStringProgrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a;
		int digit=0;
		
		String strVariable="Hellow1234d";
		String revString="HOH";
		String tempStr="";
		for(int i=0 ;i<strVariable.length();i++) {
			
			a=strVariable.charAt(i);
			
			if(Character.isDigit(a)) {
				digit++;
			}
			
			 
		}
              System.out.println("total digit count is "+digit);
	

	for(int j=revString.length()-1;j<=0;j--) {
		tempStr=tempStr+revString.charAt(j);
	}
	
	if(tempStr==	(revString))
	{
	  System.out.println("String is palidnrom");
	}
	else
	{
		System.out.println("String is not palidnrom");
	}
	}
}
