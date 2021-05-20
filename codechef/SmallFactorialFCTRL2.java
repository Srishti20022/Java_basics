package codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorialFCTRL2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n,t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			n=scn.nextInt();
			factorial(n);
		}
		scn.close();
	}
	public static void factorial (int n) {
		BigInteger fact = BigInteger.ONE;
	
		for (int i = 2; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

}
