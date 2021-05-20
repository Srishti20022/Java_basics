package codechef;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println((int)(Math.sqrt(s.nextInt())));
		}
		s.close();
	}

}
