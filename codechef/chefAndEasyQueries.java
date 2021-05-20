package codechef;

import java.util.Scanner;

public class chefAndEasyQueries {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);// d represents number of days
		// n represents total numbe of days
		int q,n,k,t = scn.nextInt(), d,f ;// q represents the total number of queries left 
		for (int i = 0; i < t; i++) {
			q=f=0;
			n = scn.nextInt();
			k = scn.nextInt();
			for ( d = 1; d <= n; d++) {
				q = q + scn.nextInt();
				q = q-k;
				if(f==0)
				if(q<0) {
					f =d;
				}
				
				}
			while(f==0){
					
					q = q-k;
					d++;
					if(q<0) {
						break;
					}
					
				}
				 if (f!=0)
				System.out.println(f);
				 else {
					System.out.println(d-1);
				}
			}
		scn.close();
	}

}
