package problems;

public class SubstringOfAnother {
// Check if a string is substring of another
	public static void main(String[] args) {
		String txt = "deepagrahari";
		String pat = "epa";
		int a = subStringOfAnother(txt, pat);
		int b = subStringOfAnother(txt, "ari");
		System.out.println(a + " "+ b);

	}

private static int subStringOfAnother(String txt, String pat) {
	int n = txt.length();
	int m = pat.length();
	for(int i = 0; i <= n - m; i++) {
		int j;
		for(j = 0; j < m; j++) {
			if(txt.charAt(i+j) != pat.charAt(j)) {
				break;
			}
		}
		if(j == m) {
			return i;
		}
	}
	return -1;
	// TODO Auto-generated method stub
	
}

}
