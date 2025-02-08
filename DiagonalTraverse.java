package problems;

public class DiagonalTraverse {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int[] arr = diagonalTraverse(matrix);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int[] diagonalTraverse(int[][] matrix) {
		if(matrix.length == 0) {
			return new int[0];
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int[] arr = new int[m*n];
		int i = 0;
		int row = 0;
		int col = 0;
		Boolean up = true;
		while(row < m && col < n) {
			if(up) {
				while(row > 0 && col < n-1) {
					arr[i++] = matrix[row][col];
					row--;
					col++;
				}
				arr[i++] = matrix[row][col];
				if(col == n-1) {
					row++;
				}else {
					col++;
				}
			}else {
				while(col > 0 && row < m-1) {
					arr[i++] = matrix[row][col];
					col--;
					row++;
				}
				arr[i++] = matrix[row][col];
				if(row == m-1) {
					col++;
				}else {
					row++;
				}
			}
			up = !up;
		}
		return arr;
	}

}
