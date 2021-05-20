package codechef;

import java.util.Scanner;

public class ChefAndWay {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(),k=scn.nextInt();
		int m=1;//m represents the final product required 
		m = (n-1)%k;
		for (int i = m+k; i <= n; i+=k) {
			m = m*k;
		}
		System.out.println(m);
		scn.close();
	}

}
