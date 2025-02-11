package problems;

public class FirstLastPosition {
	
//	Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//	If target is not found in the array, return [-1, -1]
//	Input: nums = [5,7,7,8,8,10], target = 8
//	Output: [3,4]

	public static void main(String[] args) {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 8;
		int[] result = firstLastPosition(nums, target);
		System.out.println(result[0]+" "+ result[1]);

	}

private static int[] firstLastPosition(int[] nums, int target) {
	int[] result = new int[2];
	result[0] = firstPosition(nums, target);
	result[1] = lastPosition(nums, target);
	return result;
}

private static int firstPosition(int[] nums, int target) {
	int low = 0;
	int high = nums.length-1;
	int index = -1;
	while(low <= high) {
		int mid = low + (high - low)/2;
		if(nums[mid] >= target) {
			high = mid - 1;
		}else {
			low = mid+1;
		}
		if(nums[mid] == target) {
			index = mid;
		}
	}
	return index;
}

private static int lastPosition(int[] nums, int target) {
	int low = 0;
	int high = nums.length-1;
	int index = -1;
	while(low <= high) {
		int mid = low + (high - low)/2;
		if(nums[mid] <= target) {
			low = mid + 1;
		}else {
			high = mid - 1;
		}
		if(nums[mid] == target) {
			index = mid;
		}
	}
	return index;
}

}
