package problems;

public class CountBinarySubStrings {

	public static void main(String[] args) {
		String s = "1100010";   //11000 0001 10  = 2 + 1 + 1 = 4
		int result = countBinarySubStrings(s);
		System.out.println(result);

	}

	public static int countBinarySubStrings(String s) {
		int prev = 0;
		int curr = 1;
		int count = 0;
		int i = 1;
		while(i < s.length()) {
			if(s.charAt(i-1) != s.charAt(i)) {
				count += Math.min(prev, curr);
				prev = curr;
				curr = 1;
			}
			else {
				curr++;
			}
			i++;
		}
		return count += Math.min(prev, curr);
	}

}
