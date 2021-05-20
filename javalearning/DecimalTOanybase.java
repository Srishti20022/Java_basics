package javalearning;

import java.util.Scanner;
//Conversion of decimal to anybase number 
public class DecimalTOanybase {

	public static void main(String[] args) {

		System.out.println("Write the base to which decimal to be converted : ");
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		System.out.println("Write the number to be converted to decimal number : ");
		int n = s.nextInt();
		int r = 1, a = 1, flag = 0, x = 0;// r is the remainder
		// a is the base raise to the power which is being mulplied to remainder
		// x is the final number
		int c = n;// c is the number which is repeatedly divided by 10
		while (c != 0) {
			r = c % b;
			c = c / b;
			if (flag == 1) // to raise base to power 0
			{
				a = a * 10;
			}
			flag = 1;
			x = (r * a) + x;

		}
		System.out.println("The number " + n + " with base 10 converted to the base " + b + " is " + x);

	}

}
