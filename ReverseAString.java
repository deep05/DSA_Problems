package problems;

public class ReverseAString {

	public static void main(String[] args) {
		String inputString = "DeepAgrahari";
		String outputString = "";
		for(int i = inputString.length()-1; i >= 0 ; i--) {
			outputString += inputString.charAt(i);
		}
		System.out.println(outputString);
	}

}
