package ChallengesFundamentals;

import java.util.Scanner;
//conversion of binary to the respective decimal number
public class VonNeumanLovesBinary {

	public static void main(String[] args) {
		int n;// number of binary number to be entered by user
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[] bin = null;
		bin = new int[n];
		int[] dec = null;
		dec = new int[n];
		for (int i = 0; i < n; i++) {
			bin[i] = s.nextInt();
			dec[i] = decimal(bin[i]);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(dec[i]);

		}

	}

	public static int decimal(int n) {
		int r = 1, a = 1, flag = 0, x = 0;// r is the remainder
		// a is the base raise to the power which is being mulplied to remainder
		// x is the final number
		int c = n;// c is the number which is repeatedly divided by 10
		while (c != 0) {
			r = c % 10;
			c = c / 10;
			if (flag == 1) // to raise base to power 0
			{
				a = a * 2;
			}
			flag = 1;
			x = (r * a) + x;

		}
		return x;
	}

}
