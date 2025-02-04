package problems;

import java.util.ArrayList;

public class Abcc {
	
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();
		String arr[] = {"Red", "Blue", "green", "pink", "white"};
		int count = arr[0].length();
		int maxCount = arr[0].length();
		for(int i = 1; i < arr.length; i++) {
			count = arr[i].length();
			if(maxCount > count) {
				maxCount = count;
			}
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i].length() == maxCount) {
//				list.add(arr[i]);
//			}
//		}
//		
	}

}
