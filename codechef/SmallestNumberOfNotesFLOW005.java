package codechef;

import java.util.Scanner;

public class SmallestNumberOfNotesFLOW005 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		byte t = scn.nextByte();
		int sum ;
		for (byte i = 0; i < t; i++) {
			sum = 0;
			int s = scn.nextInt();
			sum = sum + s/100;
			s = s - 100*(s/100);
			sum = sum + s/50;
			s = s - 50*(s/50);
			sum = sum + s/10;
			s = s - 10*(s/10);
			sum = sum + s/5;
			s = s - 5*(s/5);
			sum = sum + s/2;
			s = s - 2*(s/2);
			sum = sum + s/1;
			s = s - 1*(s/1);
			System.out.println(sum);
		}
	}

}
