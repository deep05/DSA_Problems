package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateChar {
	
	//Find the duplicate characters in a string using map

	public static void main(String[] args) {
		String str = "deepagrahari";
		duplicateCharacter(str);

	}

	private static void duplicateCharacter(String str) {
		Map<Character, Integer> mp = new HashMap<>();
		for(char ch : str.toCharArray()) {
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}else {
				mp.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.print(entry.getKey()+ " ");
			}
		}
	}

}
