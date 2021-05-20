package javalearning;

import java.util.Scanner;

// Programme to find HCF of two numbers by Long Divsion Method

public class HCF {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		System.out.println("Write two numbers whose HCF is required ( Smaller then Greater ) : ");
		int d = Scn.nextInt(); // divisor
		int D = Scn.nextInt(); // divident
		int R = 1;
		System.out.print("HCF of " + d + " and " + D + " is ");
		while (R != 0) {
			R = D % d;
			D = d;
			d = R;
		}
		System.out.print(D);

	}

}
