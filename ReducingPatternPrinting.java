package problems;

import java.util.Scanner;

public class ReducingPatternPrinting {

	public static void main(String[] args) {
		System.out.println("Enter te number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		reducingPatternPrint(n);

	}

	private static void reducingPatternPrint(int n) {
		int size = 2 * n - 1;
		int front = 0; 
		int back = size - 1;
		int[][] arr = new int[size][size];
		for(int i = n; i >= 1; i--) {
			for(int j = front; j <= back; j++) {
				for(int k = front; k <= back; k++) {
					if(j == front || j == back || k == front || k == back) {
						arr[j][k] = i;
					}
				}
			}
			front++;
			back--;
		}
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
