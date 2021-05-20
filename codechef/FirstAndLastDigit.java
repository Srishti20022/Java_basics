package codechef;

import java.util.Scanner;

public class FirstAndLastDigit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			sum(scn.nextInt());
		}
		scn.close();
	}

	private static void sum(int n) {
		int s = n % 10;
		n = n / 10;
		if (n != 0) {
			while (n / 10 != 0) {
				n = n / 10;
			}
			System.out.println(s + n);
		} else
			System.out.println(s + s);

	}
}
