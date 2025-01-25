package problems;

public class SecondLargestNumInArray {

	public static void main(String[] args) {
		int[] arr = {1, 4, 6, 1, 3, 8};
		for(int i = 0; i < arr.length;i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = arr.length-2; i >=0; i--) {
			if(arr[i] != arr[i-1]){
				System.out.println(arr[i]);
				break;
			}
		}
//		for(int i = 0; i < arr.length; i++)
//			System.out.print(arr[i]);
	}

}
