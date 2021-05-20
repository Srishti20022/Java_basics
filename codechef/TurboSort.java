package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class TurboSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int[] arr = new int[t];
		for (int i = 0; i < t; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < t; i++) {
			System.out.println(arr[i]);
		}
		scn.close();
	
	}

}
