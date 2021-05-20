package javalearning;

import java.util.Scanner;

//Pattern1 

//  *
// * *
//* * *
// * *
//  *

public class Pattern1 {
	public static void main(String[] args) {
		System.out.print("Write the number : ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// i counts no. of stars
		// loop for first half of pattern
		for (int i = 1; i <= n; ++i) {
			// loop for spaces before star
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");

			}
			// loop for no. of stars to be printed
			for (int k = i; k > 0; k--) {
				System.out.print("* ");

			}
			System.out.println();
		}
		// loop for 2nd half of pattern
		for (int i = n - 1; i >= 0; i--) {
			// loop for spaces before star
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");

			}
			// loop for numbe of stars
			for (int k = i; k > 0; k--) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}
}