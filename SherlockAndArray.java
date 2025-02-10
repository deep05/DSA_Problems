package problems;

public class SherlockAndArray {
	
//	find an element of the array such that the sum of all elements to the left is equal to the sum of all elements to the right.

	public static void main(String[] args) {
		int[] arr = {5, 6, 8, 11};
		System.out.println(sherlockAndArray(arr));
		

	}

private static String sherlockAndArray(int[] arr) {
	int sum = 0;
	for(int i : arr) {
		sum += i;
	}
	int left = 0;
	int right = 0;
	for(int i  = 0; i < arr.length; i++) {
		right = sum - arr[i] - left;
		if(left == right) {
			return "YES";
		}
		left = left + arr[i];
	}
	return "NO";
}

}
