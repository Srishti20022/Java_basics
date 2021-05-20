package ChallengesFundamentals;

import java.util.Scanner;
//given a list of numbers , stop processing input after the sum of cumulative sun of all 
//the input becomes negative
public class SimpleInput {

	public static void main(String[] args) {
		int[] arr = null;
		arr = new int[5];
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; sum >= 0; i++) {
			if (i != 0) {
				System.out.println(arr[i - 1]);
			}

			sum = sum + arr[i];
		}

	}

}
