package codechef;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;



public class SumOfDigitsFLOW006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();//n represents number of test cases
		int [] arr = new int [n];
		int sum ;//to store sum of digits
		int num;
		for (int i = 0; i < n; i++) {
			num = scn.nextInt();
			sum = 0;
			while(num!=0) {
				sum = sum + num%10;
				num = num / 10;
			}
			arr[i] = sum;
		}
		for (int j : arr) {
			System.out.println(j);
		}
		scn.close();

	}

}
