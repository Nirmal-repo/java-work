package com.java.string.tutorial;

public class SecondLargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {14,23,24,212,54,67};
		int largest =arr[0];
		int secondLargest=arr[0];
		
		System.out.println("The Given array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest =arr[i];
			}else if(arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		
      System.out.println("Second Largest element is :"+secondLargest);
	}

}