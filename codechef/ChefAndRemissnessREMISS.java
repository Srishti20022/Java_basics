package codechef;

import java.util.Scanner;

public class ChefAndRemissnessREMISS {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	byte t = scn.nextByte();
	for (byte i = 0; i < t; i++) {
		int a = scn.nextInt();
		int b = scn.nextInt();
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		System.out.println(a+b);
		}
	scn.close();
	}

}
