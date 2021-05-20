package ChallengesFundamentals;

import java.util.Scanner;

public class PrintReverse {
	public static void main(String[] arg) {
		System.out.println("Write the number whose reverse is required : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = n, r, a = 0, k = 1, y = 0;// a represents number of digits in the number
		// k will help in saving the reverse number
//r is the remainder
		// y is the new number
		while (x != 0) {
			x = x / 10;
			a++;
		}
		for (int i = 1; i < a; i++) {
			k = (int) (k * 10);

		}
		x = n;
		while (x != 0) {
			r = x % 10;
			x = x / 10;
			y = (k * r) + (y);
			k = k / 10;
		}
		System.out.println("Reverse of number " + n + " is " + y);
	}

}
