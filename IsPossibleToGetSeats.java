package problems;

public class IsPossibleToGetSeats {

	public static void main(String[] args) {
		int[] seats = {0, 0, 1, 0, 0, 0, 1};
		int n = 2;
		if(isPossibleToGetSeats(seats, n)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

	private static boolean isPossibleToGetSeats(int[] seats, int n) {
		int availableSeats = 0;
		int prev;
		int next;
		for(int i = 0; i < seats.length; i++) {
			if(i == 0) {
				prev = 0;
			}else {
				prev = seats[i-1];
			}
			if(i == seats.length-1) {
				next = 0;
			}else {
				next = seats[i+1];
			}
			if(prev + next + seats[i] == 0) {
				availableSeats++;
				if(availableSeats == n) {
					return true;
				}
				i++;
			}
		}
		return false;
	}

}
