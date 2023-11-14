package com.problems.tapAcademy.codingTask.day04;

public class MinimumAndMaximum {

	public static void main(String[] args) {
		
		int[] arr = {0,3,5,-6,8,9,7,4,10};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("min: "+min);
		System.out.println("max: "+max);
	}
}
