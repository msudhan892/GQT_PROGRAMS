package com.gqt.gqtcorejava.Pattern;

import java.util.Scanner;

public class ProgramI {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of n :");
		int n = sc.nextInt();
		// outer loop
		for (int i=0;i<n;i++) {
			// inner loop
			for (int j=0;j<n;j++) {
				// condition
				if (i==0 || i==n-1 || j==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j=0;j<n;j++) {
				// condition
				if (i==0 || i==n-1 || j==n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
				}
			
		}			

}
