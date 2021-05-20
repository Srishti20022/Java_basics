package codechef;

import java.util.Scanner;

public class DecrementOrInrement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int n;
		for (int i = 0; i < t; i++) {
			n = scanner.nextInt();
			if(n%4==0) {
				System.out.println(++n);
			}else {
				System.out.println(--n);
			}
		}
		scanner.close();
	}

}
