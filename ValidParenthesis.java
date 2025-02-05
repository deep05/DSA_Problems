package problems;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String s = "([])()";
		System.out.println(isValidParenthesis(s));

	}

	public static Boolean isValidParenthesis(String s) {
		Stack<Character> st = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '(') {
				st.push(')');
			}
			else if(c == '{') {
				st.push('}');
			}
			else if(c == '[') {
				st.push(']');
			}
			else if(st.isEmpty() || st.pop() != c ) {
				return false;
			}
		}
		return st.isEmpty();
	}

}
