package codechef;

import java.util.Scanner;

public class CheifAndOperatorCHOPRT {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		short t = scn.nextShort();
		for (int i = 0; i < t; i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			if(a>b) {
				System.out.println(">");
			}else if(a<b) {
				System.out.println("<");
			}else if(a==b) {
				System.out.println("=");
			}
		}
		scn.close();
	}

}
