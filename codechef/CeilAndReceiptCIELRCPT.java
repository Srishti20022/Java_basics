package codechef;

import java.util.Scanner;

public class CeilAndReceiptCIELRCPT {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		byte t =  scn.nextByte();
		int max ,n;
		for(byte i = 0;i<t;++i) {
			n = scn.nextInt();
			max = 0;
			for(int j = 2048;j>0;j=j/2) {
				max = max + (n/j);
				n = n - (j*(n/j));
			}
			System.out.println(max);
		}
		scn.close();
	}

}
