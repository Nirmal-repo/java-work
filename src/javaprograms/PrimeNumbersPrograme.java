package javaprograms;

public class PrimeNumbersPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =27;
		int mid=number/2;
		boolean flag = false;
		
		for(int i=2;i<mid;i++) {
			if(number%i==0) {
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Given number is a prime :"+number);
		}else
		{
			System.out.println("Given number is not prime :"+number);
		}

	}

}
