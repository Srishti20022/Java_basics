package javalearning;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		System.out.print("Write the value of n for pattern : ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print("  ");

			}
			for (int j = 0; j < (2 * i) + 1; j++) {
				if (j % 2 == 0)
					System.out.print("* ");
				else {
					System.out.print("! ");
				}
			}
			System.out.println();
		}

	}

}
