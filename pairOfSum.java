package problems;

import java.util.HashSet;

public class pairOfSum {

	public static void main(String[] args) {
		int[] arr = {0, -1, 2, -3, 1};
		int target = -2;
		Boolean bool = twoSumPair(arr, target);
		System.out.println(bool);

	}

	public static Boolean twoSumPair(int[] arr, int target) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			
			if(set.contains(complement)) {
				return true;
			}
			
			set.add(arr[i]);
		}
		return false;
	}

}
