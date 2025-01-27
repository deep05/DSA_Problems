package problems;

import java.util.Scanner;

public class InnerReducingPattern {
	
	/*
	 *  Input : 4
		Output : 
		 4444444
         4333334
         4322234
         4321234
         4322234
         4333334
         4444444
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		pattern(n);

	}

	public static void pattern(int n) {
		int size = 2 * n - 1;
		int start = 0;
		int end = size - 1;
		int arr[][] = new int[size][size];
		while(n!=0) {
			for(int i = start; i <= end; i++) {
				for(int j = start; j <= end; j++) {
					if(i == start || i == end || j == start || j == end) {
						arr[i][j] = n;
					}
				}
			}
			start++;
			end--;
			n--;
		}
		display(arr, size);
		
		
	}

	public static void display(int[][] arr, int size) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
