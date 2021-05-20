package javalearning;

import java.util.Scanner;
//Determining wherter input character lowercase alphabet or uppercase alphabet or other than that.
public class UppercaseORlowercase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		if (ch >= 65 && ch <= 90) {
			System.out.println("The input is an uppercase alphabet.");

		} else if (ch >= 97 && ch <= 122) {

			System.out.println("The input is an lowercase alphabet.");
		} else {
			System.out.println("The input is not an alphabet.");
		}

	}

}
