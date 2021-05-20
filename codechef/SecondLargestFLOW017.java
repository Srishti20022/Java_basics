package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SecondLargestFLOW017 {

	public static void main(String[] args)throws Exception {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int t = Integer.parseInt(br.readLine());
		  int a, b, c;
		  for (int i = 0; i < t; i++) {
			   a = Integer.parseInt(br.readLine());
			   b = Integer.parseInt(br.readLine());
			   c = Integer.parseInt(br.readLine());
			   if(a>b&&a>c) {
				   if(b>c) {
					   System.out.println(b);
				   }else {
					System.out.println(c);
				}
			   }else if(b>c) {
				   if(a>c) {
					   System.out.println(a);
				   }else {
					   System.out.println(c);
				   }
			   }else {
				   if(a>b) {
					   System.out.println(a);
				   }else {
					   System.out.println(b);
				   }
			   }
		}
	}

}
