package problems;

import java.util.HashSet;
import java.util.Set;

public class RepeatingCharProduct {
	//find the repeating characters between two strings in an array and return the max product of their lengths
	public static void main(String[] args) {
		String[] strArr = {"abc", "def", "gha", "xyz"};
		System.out.println(repeatingCharProduct(strArr));

	}

	private static int repeatingCharProduct(String[] strArr) {
		int maxProduct = 0;
		for(int i = 0; i < strArr.length; i++) {
			for(int j = i; j < strArr.length; j++) {
				if(hasCommonChar(strArr[i], strArr[j])) {
					int product = strArr[i].length() * strArr[j].length();
					maxProduct = Math.max(maxProduct, product);
				}
			}
		}
		return maxProduct;
	}

	private static boolean hasCommonChar(String s1, String s2) {
		Set<Character> set = new HashSet<>();
		for(char ch : s1.toCharArray()) {
			set.add(ch);
		}
		for(char ch : s2.toCharArray()) {
			if(set.contains(ch)) {
				return true;
			}
		}
		return false;
	}

}
