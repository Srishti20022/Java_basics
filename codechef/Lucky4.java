package codechef;

import java.util.Scanner;

public class Lucky4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			count4(scn.nextInt());
		}
		scn.close();
	}

	public static void count4(int n) {
		int count = 0;
		while (n != 0) {
			if (n % 10 == 4) {
				count++;
			}
			n = n / 10;
		}
		System.out.println(count);
	}

}
