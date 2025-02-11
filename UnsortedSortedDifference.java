package problems;

import java.util.Arrays;

public class UnsortedSortedDifference {
	//find the number of positions where an unsorted array differs from its sorted version.
	//input : [1, 2,5,4,3,6] output :2

	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 4, 3, 6};
		System.out.println(unsortedSortedDifference(arr));

	}

	private static int unsortedSortedDifference(int[] arr) {
		int count = 0;
		int[] sortedArr = arr.clone();
		Arrays.sort(sortedArr);
		for(int i = 0; i < sortedArr.length; i++) {
			if(arr[i] != sortedArr[i]) {
				count++;
			}
		}
		return count;
	}

}
