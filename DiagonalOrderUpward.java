package problems;

public class DiagonalOrderUpward {
	public static void main(String args[]) {
		int[][] M = {
				{1, 2, 3, 4}, 
				{5, 6, 7, 8},
				{9, 10, 11, 12}, 
				{13, 14, 15, 16},
				{17, 18, 19, 20}
		};
		diagonalMatrix(M);
	}

	private static void diagonalMatrix(int[][] m) {
		int rows = m.length;
		int columns = m[0].length;
		for(int k = 0; k <= rows-1; k++) {
			int i = k;
			int j = 0;
			while(i >= 0 && j < columns-1) {
				System.out.print(m[i][j] + " ");
				i--;
				j++;
			}
			System.out.println();
		}
		for(int k = 1; k <= columns-1; k++) {
			int i = rows - 1;
			int j = k;
			while(j <= columns-1) {
				System.out.print(m[i][j] + " ");
				i--;
				j++;
			}
			System.out.println();
		}
	}

}
