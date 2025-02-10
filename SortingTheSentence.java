package problems;

public class SortingTheSentence {

	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortingTheSentence(s));

	}

	private static String sortingTheSentence(String s) {
		String[] words = s.split(" ");
		String[] arr = new String[words.length];
		for(String word : words) {
			int n = word.length();
			int index = word.charAt(n-1) - '0';
			arr[index - 1] = word.substring(0,n-1);
		}
		StringBuilder sb = new StringBuilder();
		for(String word : arr) {
			sb.append(word);
			sb.append(" ");
		}
		return sb.toString().trim();
	}

}
