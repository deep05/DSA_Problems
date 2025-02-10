package problems;

public class EvendigitInArray {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		System.out.println(countEvenDigit(nums));

	}

	private static int countEvenDigit(int[] nums) {
		int count = 0;
		for(int num : nums) {
			int len = Integer.toString(num).length();
			if(len %2 == 0) {
				count++;
			}
		}
		return count;
	}

}
