package ChallengesFundamentals;

import java.util.Scanner;

//function which prints n1 terms of the series 3n+2 which are not multiples of n2
public class PrintSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int i = 1, j = 1, num;

		while (j <= n1) {
			num = (3 * i + 2);
			i++;
			if (num % n2 != 0) {
				System.out.println(num);
				j++;
			}

		}
	}

}
