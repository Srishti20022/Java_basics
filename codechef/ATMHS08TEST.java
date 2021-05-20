package codechef;

import java.util.Scanner;

public class ATMHS08TEST {

	public static void main(String[] args) {
		float y;
		int x;
		Scanner scn = new Scanner(System.in);
		x = scn.nextInt();
		y = scn.nextFloat();
		if (x % 5 == 0) {
			if (x > y - 0.5) {
				System.out.println(y);
			} else {
				y = (float) (y - x - 0.5);
				System.out.println(y);
			}
		} else {
			System.out.println(y);
		}
		scn.close();
	}

}
