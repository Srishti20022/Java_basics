package codechef;

import java.util.Scanner;

public class TheLeadGameTLG {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int s1=0,s2=0,l=0,w=1,n=scn.nextInt();//l represents lead and w epresents winner 
		//n represents test cases
		for (int i = 0; i < n; i++) {
			s1 = s1 + scn.nextInt();
			s2 = s2 + scn.nextInt();
			if( s1>s2 && l<=s1-s2) {
				l = s1-s2;
				w = 1;
			}else if(s1<s2 & l<=(s2-s1)) {
				l = s2-s1;
				w = 2;
			}
		}
		System.out.println(w+" "+l);
		scn.close();
	}

}
