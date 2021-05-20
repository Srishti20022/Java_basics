package codechef;

import java.util.Scanner;

public class TheOneWhoKnocks {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		for ( int i = 0; i < t; i++ ) {
			int x = scn.nextInt();
			int y = scn.nextInt();
			int a = y-x;
			if ( a== 0 ) {
				System.out.println("0");
			} else if( a > 0 ) {
				if(a%2==0) {
					System.out.println("2");
				} else {
					System.out.println("3");
				}
			} else {
				if(a%2==0) {
					System.out.println("1");
				} else {
					System.out.println("2");
				}
			}	System.out.println(a%2);
		}
	
		scn.close();
	}

}
