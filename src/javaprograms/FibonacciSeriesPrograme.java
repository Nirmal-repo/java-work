package javaprograms;

public class FibonacciSeriesPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=10;
		int num1=0,num2=1;
		int sum=0;
		
		for(int n=0;n<=number;n++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			System.out.println(sum);
		}
		
		
		
	}

}
