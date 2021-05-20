package codechef;

import java.util.Scanner;

public class CovidRun {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int n, k, x, y, f ;
		for (int i = 0; i < t; i++) {
			f=0;
			n = scn.nextInt();
			k = scn.nextInt();
			x = scn.nextInt();
			y = scn.nextInt();
			for (int j = 0; j < 1000; j++) {
				if (x == y) {
					System.out.println("YES");
					f = 1;
					break;
				}
				x = (x + k) % n;
			}
			if (f == 0) {
				System.out.println("NO");
			}
		}
		scn.close();
	}

}
