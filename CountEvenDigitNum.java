package problems;

public class CountEvenDigitNum {
	public static void main(String args[]) {
		int[] arr = {12, 345, 2, 6, 7896};
		int ans = countEvenDigit(arr);
		System.out.println("No. of even digits = " +ans);
	}

	public static int countEvenDigit(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			String x = Integer.toString(arr[i]);
			if(x.length() % 2 == 0) {
				count++;
			}
		}
		return count;
	}

}
