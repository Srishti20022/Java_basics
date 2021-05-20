package javalearning;

import java.util.Scanner;

// pattern 
//*****
//upto n rows
public class pattern0 {

	public static void main(String[] args) {
		System.out.print("Write the number of rows upto which pattern is required : ");

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print(" * ");

			}
			System.out.println();
		}

	}

}
