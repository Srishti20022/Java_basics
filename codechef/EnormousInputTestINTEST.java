package codechef;

import java.util.Scanner;

public class EnormousInputTestINTEST {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();// n represents count of input
		int k = scn.nextInt();// k represents the number to be checked divisible by
		int a, count = 0;
		for (int i = 0; i < n; i++) {
			a = scn.nextInt();
			if (a % k == 0) {
				count++;
			}
		}
		System.out.println(count);
		scn.close();
	}
}
