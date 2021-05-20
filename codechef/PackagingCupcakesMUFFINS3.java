package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PackagingCupcakesMUFFINS3 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n!=0)
			System.out.println((n/2)+1);
			else {
				System.out.println(0);
			}
		}

	}

}
