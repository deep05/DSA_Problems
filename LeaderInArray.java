package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {
	//find all the Leaders in the array. An element is a Leader if it is greater than or equal to all the elements to its right side.
	public static void main(String args[]) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		System.out.println(leaderInArray(arr));
	}

	private static List<Integer> leaderInArray(int[] arr) {
		List<Integer> leaders= new ArrayList<Integer>();
		
		int maxRight = arr[arr.length-1];
		leaders.add(maxRight);
		for(int i  = arr.length-2; i >=0; i--) {
			if(arr[i] >= maxRight) {
				maxRight = arr[i];
				leaders.add(maxRight);
			}
		}
		Collections.reverse(leaders);
		return leaders;
	}

}
