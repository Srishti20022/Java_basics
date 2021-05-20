package codechef;

import java.util.Scanner;

public class AddTwoNumberFLOW001 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		short n = scn.nextShort();
		int[] arr = new int[n];
		int a, b;
		for (int i = 0; i < n; i++) {
			a = scn.nextInt();
			b = scn.nextInt();
			arr[i] = a + b;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		scn.close();
	}

}
