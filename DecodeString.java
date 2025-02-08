package problems;

import java.util.Stack;

public class DecodeString {
//	Input: s = "3[a2[c]]"
//	Output: "accaccacc"

	public static void main(String[] args) {
		String input = "3[a]2[bc]";
		System.out.println(decodeString(input));

	}

	public static String decodeString(String s) {
		Stack<Integer> countStack = new Stack<>();
		Stack<String> stringStack = new Stack<>();
		int count = 0;
		String curr = "";
		for(char c : s.toCharArray()) {
			if(Character.isDigit(c)) {
				count = count * 10 + (c - '0');
			}
			else if(c == '[') {
				countStack.push(count);
				stringStack.push(curr);
				count = 0;
				curr = "";
			}
			else if(c == ']') {
				StringBuilder decodeString = new StringBuilder(stringStack.pop());
				int repeat = countStack.pop();
				for(int i = 0; i < repeat; i++) {
					decodeString.append(curr);
				}
				curr = decodeString.toString();
			}
			else {
				curr+=c;
			}
		}
		return curr;
	}

}