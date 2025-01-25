package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortStringDigitwise {
	// input : {is2, a3, Th1is, strin4g}
	// output : {This is a string}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of words in the sentence : ");
		int n = sc.nextInt();
		String[] jumbledList = new String[n];
		for(int i = 0; i < n; i++) {
			jumbledList[i] = sc.nextLine();
		}
		SortStringDigitwise ob = new SortStringDigitwise();
		ob.sortString(jumbledList, n);
	}
	
	public void sortString(String[] jumbledList, int n) {
		Map<String, Integer> d = new HashMap<>();
		for(String string : jumbledList) {
			for(char ch : string.toCharArray()) {
				if(Character.isDigit(ch)) {
					d.put(string, Character.getNumericValue(ch));
				}
			}
		}
		
	}

}
