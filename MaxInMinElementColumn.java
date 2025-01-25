package problems;

public class MaxInMinElementColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{2, 4, 5}, {3, 4, 0}, {1, 2, 9}};
		int minElement = Integer.MAX_VALUE;
		int column = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(arr[i][j] < minElement) {
					minElement = arr[i][j];
					column = j;
				}
			}
		}
		int maxInColumn = Integer.MIN_VALUE;
		for(int i = 0; i <= column; i++) {
			if(arr[i][column] > maxInColumn) {
				maxInColumn = arr[i][column];
			}
		}
		System.out.println("max in Column : " +maxInColumn);

	}

}
