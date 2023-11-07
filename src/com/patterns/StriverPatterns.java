package com.patterns;

import java.util.Scanner;

class Patterns22 {

	public void pattern01(int n) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void pattern02(int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void pattern03(int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

	public void pattern04(int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

	
	public void pattern05(int n) {
		// TODO Auto-generated method stub
		for (int i = n; i >=1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void pattern06(int n) {
		// TODO Auto-generated method stub
		for (int i = n; i>=1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

	public void pattern07(int n) {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<=n;i++) {
			
			
			for(int s = 1;s<=n-i;s++) {
				
				System.out.print("  ");
			}
			
			for(int j = 1;j<=i*2-1;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

public class StriverPatterns {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("enter the n value: ");
		int n = scan.nextInt();
		Patterns22 sp = new Patterns22();

//		sp.pattern01(n);
//		sp.pattern02(n);
//		sp.pattern03(n);
//		sp.pattern04(n);
//		sp.pattern05(n);
//		sp.pattern06(n);
//		sp.pattern07(n);
	}

}
