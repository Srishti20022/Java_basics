package javalearning;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		System.out.print("Write  the number n for pattern : ");

		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");

			}
			System.out.print("*");
			for (int j = 0; j < n - 2 - (2 * i); j++) {
				System.out.print(" ");

			}
			System.out.print("*\n");

		}
		if (n % 2 != 0)
			for (int i = 0; i < n / 2; i++) {
				System.out.print(" ");

			}
		System.out.print("*\n");
		for (int i = n / 2 - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");

			}
			System.out.print("*");
			for (int j = 0; j < n - 2 - (2 * i); j++) {
				System.out.print(" ");

			}
			System.out.print("*\n");

		}
	}

}
