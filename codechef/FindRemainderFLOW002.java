package codechef;

import java.util.Scanner;

public class FindRemainderFLOW002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		short n = scn.nextShort();
		int a,b;
		for(int i = 0; i<n; ++i) {
			a = scn.nextInt();
			b = scn.nextInt();
			System.out.println(a%b);
			}
		scn.close();
	}

}
