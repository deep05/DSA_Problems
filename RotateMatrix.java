package problems;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		rotateMatix(matrix);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j< matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void rotateMatix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = i+1 ; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			reverse(matrix[i]);
		}
	}

	private static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}

}
