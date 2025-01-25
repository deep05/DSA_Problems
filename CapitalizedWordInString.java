package problems;

public class CapitalizedWordInString {

	public static void main(String[] args) {
		String inputString = "ImpactAnalyticsInterver";
		int count = 0;
		for(int i = 0; i < inputString.length(); i++) {
			if(inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println("Total no. of Capital Words = "+count);
	}

}
