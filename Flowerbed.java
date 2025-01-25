package problems;

public class Flowerbed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {1,0,0,0,1};
		int n = 1;
		Boolean bool = flowerBed(flowerbed, n);
		System.out.println(bool);

	}

	public static Boolean flowerBed(int[] flowerbed, int n) {
		int len = flowerbed.length;
		int i = 0;
		while(i < len && n > 0) {
			if(flowerbed[i] == 1) {
				i+=2;
			}
			else if(i == len -1 || flowerbed[i+1] == 0) {
				n--;
				i+=2;
			}
			else
				i+=3; //{0,1,0,1,0}
		}
		return n<=0;
	}

}
