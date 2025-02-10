package problems;

public class MaxSubarraySumModuloM {

	public static void main(String[] args) {
		int[] nums = {3, 3, 9, 9, 5};
		int m = 7;
		System.out.println(maxSubarraySumModuloM(nums, m));

	}

	private static int maxSubarraySumModuloM(int[] nums, int m) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(sum < 0) {
				sum = 0;
			}
			sum += nums[i];
			max = Math.max(sum%m, max);
		}
		return max;
	}

}
