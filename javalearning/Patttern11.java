package javalearning;

import java.util.Scanner;

public class Patttern11 {
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
			// loop for no. of srars to be printed
			for (int k = i; k > 0; k--) {
				System.out.print("* ");

			}
			System.out.println();
		}

	}
}
