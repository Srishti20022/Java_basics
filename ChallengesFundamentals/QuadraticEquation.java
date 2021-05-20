package ChallengesFundamentals;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		System.out.println("QUADRATIC EQUATION : a*x^2 + b*x + c ");
		System.out.println("Write the corresponding values of a, b , c :");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int r1, r2;// Roots of equations
		if ((b * b) - 4 * a * c == 0) {
			System.out.println("Real and Equal");
			r1 = (int) ((-1 * b + Math.sqrt((b * b) - 4 * a * c)) / 2 * a);
			System.out.println(r1);

		} else if (((b * b) - 4 * a * c > 0)) {
			System.out.println("Real and Distinct");
			r1 = (int) ((-1 * b + Math.sqrt((b * b) - 4 * a * c)) / 2 * a);
			r2 = (int) ((-1 * b - Math.sqrt((b * b) - 4 * a * c)) / 2 * a);
			System.out.println(r1 + " " + r2);
		} else {
			System.out.println("Imaginary");

		}

	}

}
