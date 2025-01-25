package problems;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Boolean bool = happyNumber(n);
		System.out.println(bool);

	}

	public static Boolean happyNumber(int n) {
		HashSet set = new HashSet<>();
		while(true) {
			n = numSquareSum(n);
			if(n == 1) {
				return true;
			}
			if(set.contains(n)) {
				return false;
			}
			set.add(n);
		}
	}

	public static int numSquareSum(int n) {
		int num = 0;
		while(n > 0) {
			int digit = n % 10;
			num += digit * digit;
			n = n / 10;
		}
		// TODO Auto-generated method stub
		return num;
	}

	

}
