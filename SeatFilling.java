package problems;

import java.util.Scanner;

public class SeatFilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i < n ; i++){
			arr[i] = sc.nextInt();
		}
		int count = countSeats(arr, n);
		System.out.println("total can sit = "+count);

	}
	public static int countSeats(int arr[], int n) {
		int count = 0;
		boolean flag = false;
		
		for (int i = 0; i < n; i++) {
            // Only consider empty seats
            if (arr[i] == 0) {
                boolean canPlace = true;

                // Check the left adjacent seat (i-1)
                if (i - 1 >= 0 && arr[i - 1] == 1) {
                    canPlace = false;
                }

                // Check the right adjacent seat (i+1)
                if (i + 1 < n && arr[i + 1] == 1) {
                    canPlace = false;
                }

                // Check the seat 2 positions before (i-2)
                if (i - 2 >= 0 && arr[i - 2] == 1) {
                    canPlace = false;
                }

                // Check the seat 2 positions after (i+2)
                if (i + 2 < n && arr[i + 2] == 1) {
                    canPlace = false;
                }

                // If it is valid to place a person, mark the seat as filled
                if (canPlace) {
                    arr[i] = 1;
                    count++;
                }
            }
        }

        return count;
		
	}

}
