package javalearning;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		System.out.print("Write the number of rows required : ");
		Scanner Scn = new Scanner(System.in);
		int n = Scn.nextInt();
//		i represents number of stars
		for (int i = n; i >= 1; i--) {
			for (int k = n - i; k > 0; k--) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
