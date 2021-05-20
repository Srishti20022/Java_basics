package ChallengesFundamentals;
//The scheme is as follows , each car will be allowed to run on Sunday if the sum of the digits 

//which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3

import java.util.Scanner;

public class DelhiOddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();// number of car plates
		int[] car = null;
		car = new int[n];
		int[] sod = null;// sum of digits to be stored in this array
		sod = new int[n];
		int[] yn = null;// yes equivalent to 1 and no equivalent to 9
		yn = new int[n];
		for (int i = 0; i < n; i++) {
			car[i] = s.nextInt();
			sod[i] = sumofdigits(car[i]);
			yn[i] = yesANDno(sod[i], car[i]);
		}

		for (int i = 0; i < n; i++) {
			if (yn[i] == 1)
				System.out.println("Yes");
			else {
				System.out.println("No");
			}
		}

	}

	public static int sumofdigits(int n) {
		int r = 0, sum = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		System.out.println(sum);
		return sum;
	}

	public static int yesANDno(int n, int num) {
		if (num % 2 == 0) {
			if (n % 4 == 0)
				return 1;
			else
				return 0;
		} else {
			if (n % 3 == 0)
				return 1;
			else
				return 0;
		}
	}

}
