package codechef;

import java.util.Scanner;

public class MahasenaAMR15A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int l=0,ul=0;
		for (int i = 0; i < t ; i++) {
			if(scanner.nextInt()%2==0) {
				l++;
			}else {
				ul++;
			}
		}
		if(l>ul) {
			System.out.println("READY FOR BATTLE");
		}else {
			System.out.println("NOT READY");
		}
		scanner.close();
	}

}
