package problems;

public class BalancedArrayFindElement {
	
	//Find an element in array such that sum of left array is equal to sum of right array
	//Input: 1 4 2 5 0
	//Output: 2

	public static void main(String[] args) {
		//int[] arr = {2, 3, 4, 1, 4, 5};
		int[] arr = {1, 2, 3};
		int result = FindElement(arr);
		System.out.println(result);

	}

	public static int FindElement(int[] arr) {
		for(int i = 1; i < arr.length-1; i++) {
			int ansIndex = i;
			int sumLeft = 0;
			int sumRight = 0;
			for(int j = 0; j < ansIndex; j++) {
				sumLeft = sumLeft + arr[j];
			}
			for(int j = ansIndex + 1; j < arr.length; j++) {
				sumRight = sumRight + arr[j];
			}
			if(sumLeft == sumRight) {
				return arr[i];
			}
			
		}
		return -1;
	}

}

//Best method to solve this is Using Prefix sum and Suffix sum Arrays
