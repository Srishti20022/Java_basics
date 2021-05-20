package codechef;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			reversep(scn.nextInt());
		}
		scn.close();
	}
	public static void reversep(int n) {
		while(n!=0) {
			System.out.print(n%10);
			n = n/10;
		}
		System.out.println();
	}

}
