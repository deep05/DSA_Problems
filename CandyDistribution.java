package problems;

public class CandyDistribution {

	public static void main(String[] args) {
		int[] ratings1 = {1, 3, 8, 1, 4, 3, 5};
		int[] ratings2 = {1, 0, 2};
		System.out.println(candy(ratings1));
		System.out.println(candy(ratings2));

	}

	private static int candy(int[] ratings) {
		int result = 0;
		int n = ratings.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = 1;
		right[n-1] = 1;
		for(int i = 1; i < n; i++) {
			if(ratings[i] > ratings[i-1]) {
				left[i] = left[i-1]+1;
			}else {
				left[i] = 1;
			}
		}
		for(int i = n-2; i >= 0; i--) {
			if(ratings[i] > ratings[i+1]) {
				right[i] = right[i+1]+1;
			}else {
				right[i] = 1;
			}
		}
		for(int i = 0; i < n ; i++) {
			result += Math.max(left[i], right[i]);
		}
		return result;
	}

}
