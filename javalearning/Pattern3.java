package javalearning;

import java.util.Scanner;

//Pattern

//*
//**
//***

public class Pattern3 {

	public static void main(String[] args) {
		System.out.print("Write the number of rows required : ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}

