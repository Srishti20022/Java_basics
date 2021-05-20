package javalearning;

import java.util.Scanner;

// Sum of NATURAL NUMBERS upto n

public class sum {

	public static void main(String[] args) {
		System.out.print("Write the number upto which sum of natural number is required : ");

		Scanner Scn = new Scanner(System.in);

		int n = Scn.nextInt();
		int i = 1;
		int sum = 0;

		while (i <= n) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println("Sum of " + n + " Natural numbers is " + sum);

	}

}
