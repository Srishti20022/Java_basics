package javalearning;

import java.util.Scanner;

public class recursion {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {

			System.out.println("Choose to operation : ");
			System.out.println("1. To print n natural number .");
			System.out.println("2. To find factorial of the number .");
			System.out.println("3. To find the number raised to the power x .");
			System.out.println("4. Exit ");
			int c = scn.nextInt();
			System.out.println("Write the number : ");
			int n = scn.nextInt();
			if (c == 2) {
				int f = factorial(n);
				System.out.println(f);
			} else if (c == 1) {
				natural(n);
			} else if (c == 3) {
				System.out.println("Write the power to which numer could be raised :");
				int x = scn.nextInt();
				int p = power(n, x);
				System.out.println("The number " + n + " raised to the power " + x + " is " + p);
			} else if (c == 4) {
				System.exit(1);
			}
		}

	}

	public static void natural(int n) {
		if (n == 0) {
			return;
		}
		natural(n - 1);
		System.out.println(n);

	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		int a = factorial(n - 1);
		int f = n * a;
		return f;
	}

	public static int power(int n, int x) {
		if (x == 0) {
			return 1;
		}
		int a = power(n, x - 1);
		int f = n * a;
		return f;
	}

}
