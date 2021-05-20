package javalearning;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		System.out.print("Write the length of square : ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == n) {
				for (int j = 1; j <= n; j++) {
					System.out.print("* ");

				}
				System.out.print("\n");

			} else {
				System.out.print("* ");
				for (int j = 2; j <= n - 1; j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
				System.out.print("\n");

			}

		}

	}

}
