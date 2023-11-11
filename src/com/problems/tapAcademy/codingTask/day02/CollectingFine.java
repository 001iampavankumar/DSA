package com.problems.tapAcademy.codingTask.day02;

public class CollectingFine {

	public static void main(String[] args) {
		
		int car[] = {2375, 7682, 2325, 2352};
		int fine[] = {250, 500, 350, 200};
		int date = 8;
		
		int result = totalFine(car,fine,date);
		System.out.println("Result: "+ result);
	}

	private static int totalFine(int[] car, int[] fine, int date) {

		int total = 0;
		
		if(date%2==0) {
			
			for(int i = 0;i<car.length;i++) {
				
				if(car[i]%2!=0) {
					total = total + fine[i];
				}
			}
		}
		else if(date%2!=0) {
			
			for(int i = 0;i<car.length;i++) {
				
				if(car[i]%2==0) {
					total = total + fine[i];
				}
			}
		}
		
		
		return total;
	}
}
