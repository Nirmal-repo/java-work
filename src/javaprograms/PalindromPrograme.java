package javaprograms;

public class PalindromPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int number =121;
      int r=0;
      int temp;
      int sum=0;
      
      temp=number;
      
      while(number>0) {
    	  
    	  r=number%10;
    	  sum=(sum*10)+r;
    	  number=number/10;
    	  
      }
      
      if(temp==sum) {
    	  System.out.println("Number is palidnrom");
      }else
      {
    	  System.out.println("Number is not palidnrom");
      }
	}

}
