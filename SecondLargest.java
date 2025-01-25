package problems;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 2};
		int result = findSecondLargest(arr);
		System.out.println("second largest element in array : "+result);

	}

	public static int findSecondLargest(int[] arr) {
		int n = arr.length;
		int largest = -1;
		int secondLargest = -1;
		for(int i = 0; i < n; i++) {
			if(arr[i] >= largest ) {
				largest = arr[i];
			}
			else if(arr[i] < largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

}
