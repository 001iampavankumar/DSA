package com.problems.tapAcademy.codingTask.day01;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int n = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		
		//calling the method
		int result = secondLargest(arr);
		System.out.println("result: "+result);
		scan.close();
	}

	private static int secondLargest(int[] arr) {

		//storing the first elements of array as initial values
		int max = arr[0];
		int sMax = arr[0];
			
		//finding the length of array without using build in method
		int length = 0;
		for(int i:arr) {
			length++;
		}
	
		//to find the second largest element
		for(int i = 0;i<length;i++) {
			
			if(max<arr[i]) {	
				sMax = max;
				max = arr[i];
			}
			else if(sMax<arr[i] && max!=arr[i]) {
				sMax = arr[i];
			}
		}
		return sMax;
	}
}
