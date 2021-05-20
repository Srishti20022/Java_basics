package codechef;

import java.util.Scanner;

public class ValidTriangleFLOW013 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		byte t = scn.nextByte();
		for (int i = 0; i < t; i++) {
			if(scn.nextByte()+scn.nextByte()+scn.nextByte()==180) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		scn.close();
	}

}
