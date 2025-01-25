package problems;

import java.util.Scanner;

public class EvenLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array : ");
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = numberOfEvenLength(arr, n);
		System.out.println("no of even length elements : "+ ans);
		// TODO Auto-generated method stub
	}
	public static int numberOfEvenLength(int arr[], int n) {
		int even = 0;
		for(int i = 0; i < n; i++) {
			String x = Integer.toString(arr[i]);
			if(x.length() % 2 == 0) {
				even++;
			}
		}
		return even;
	}

}
