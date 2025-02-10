package problems;

public class KadansAlgo {

	public static void main(String[] args) {
		int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(maximumSubarraySum(nums));

	}

	private static int maximumSubarraySum(int[] nums) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(sum < 0) {
				sum = 0;
			}
			sum = sum + nums[i];
			max = Math.max(sum, max);
		}
		return max;
	}

}
