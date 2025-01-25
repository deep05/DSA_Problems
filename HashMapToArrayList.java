package problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String, String> mp = new HashMap<String, String>();
		mp.put("India", "new Delhi");
		mp.put("Impact", "Analytics");
		mp.put("Deep", "Agrahari");
		mp.put("shahrukh", "Khan");
		
		List<String> keyArray = new ArrayList<String>(mp.keySet());
		System.out.println("HashMap keys are : ");
		for(String s : keyArray) {
			System.out.println(s);
		}
		
		List<String> valueArray = new ArrayList<String>(mp.values());
		System.out.println("HashMap values are : ");
		for(String s : valueArray) {
			System.out.println(s);
		}

	}

}
