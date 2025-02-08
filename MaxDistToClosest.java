package problems;

public class MaxDistToClosest {
	//case1 : Alex will sit in between 2 people -> find mid of distance between those 2
	//case2 : Alex will sit at far left -> find first person sitting from left
	//case3 : Alex will sit at far right -> find first person sitting from right


	public static void main(String[] args) {
		int[] seats = {1, 0, 0, 0, 1, 0, 1};
		int result = maxDistanceToClosest(seats);
		System.out.println(result);

	}

	public static int maxDistanceToClosest(int[] seats) {
		int val = 0;
		int result = 0;
		//case 1
		for(int i = 0; i < seats.length; i++) {
			if(seats[i] == 1) {
				val = 0;
			}else {
				val++;
				result = Math.max(result, (val+1)/2);
			}
		}
		//case 2
		for(int i = 0; i < seats.length; i++) {
			if(seats[i] == 1) {
				result = Math.max(result, i);
				break;
			}
		}
		//case 3
		for(int i = seats.length-1; i >=0; i--) {
			if(seats[i] == 1) {
				result = Math.max(result,  seats.length - i - 1);
				break;
			}
		}
		return result;
	}

}
