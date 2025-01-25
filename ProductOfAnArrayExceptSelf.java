package problems;

public class ProductOfAnArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		int n = arr.length;
		
		int[] leftProduct = new int[n];
		int[] rightProduct = new int[n];
		
		int[] outputArray = new int[n];
		
		leftProduct[0] = 1;
		rightProduct[n-1] = 1;
		
		//leftProduct = {1, 1, 2, 6}
		for(int i = 1; i < n; i++) {
			leftProduct[i] = leftProduct[i-1] * arr[i-1];
		}
		//rightProduct = {24,12, 4, 1}
		for(int i = n-2; i >=0; i--) {
			rightProduct[i] = rightProduct[i+1] * arr[i+1]; 
		}
		
		for(int i = 0; i < n; i++) {
			outputArray[i] = leftProduct[i] * rightProduct[i];
			System.out.print(outputArray[i] + " ");
		}
	}

}
