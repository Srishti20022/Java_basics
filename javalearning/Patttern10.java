package javalearning;

import java.util.Scanner;

public class Patttern10 {

	public static void main(String[] args) {
		System.out.print("Write the value of n for the pattern : ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = n-1; i >= 0; i--) {

			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");

			}
			for (int j = 0; j < (2 * i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
