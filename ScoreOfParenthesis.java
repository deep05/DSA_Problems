package problems;

import java.util.Stack;

public class ScoreOfParenthesis {

	public static void main(String[] args) {
		String s = "(()(()))";
		int count = scoreOfParenthesis(s);
		System.out.println(count);

	}

	public static int scoreOfParenthesis(String s) {
		int count = 0;
		Stack<Integer> st = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '(') {
				st.push(0);
			}
			else {
				int val = 0;
				while(st.peek() != 0) {
					val = val + st.pop();
				}
				val = Math.max(2 * val, 1);
				st.pop();
				st.push(val);
			}
		}
		while(!st.isEmpty()) {
			count = count + st.pop();
		}
		return count;
	}

}
