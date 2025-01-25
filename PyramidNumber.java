package problems;

import java.util.Scanner;

public class PyramidNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <=n; i++ ) {
			int x = i - 1;
			for(int j = i; j < n; j++) {
				System.out.print(" ");
				System.out.print(" ");
			}
			for(int j = 0; j <= x; j++ ) {
				System.out.print((i+j) + " ");
				//System.out.print((i + j) < 2 * n ? (i+j) + " " : (i+j) + " ");
			}
			for(int j = 1; j <= x; j++) {
				System.out.print((i+x-j) + " ");
				//System.out.print((i+x-j) < 2* n ? (i+x-j) + " " : (i+x-j) +" ");
			}
			System.out.println();
			
		}
		

	}

}
