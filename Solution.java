package problems;

import java.util.Arrays;

public class Solution {
	
	
	    public static int coinChange(int[] coins, int amount) {
	        if(amount == 0){
	            return 0;
	        }
	        Arrays.sort(coins);
	        int n = coins.length;
	        //I have to found just smaller element than amount
	        int count = 0;
	        while(amount > 0){
	            int justSmaller = -1;
	            int i = 0;
	            for(; i < n && coins[i] <= amount; i++){
	                justSmaller = coins[i];
	            }
	            if(justSmaller == -1){
	                return -1;
	            }
	            else{
	                amount = amount - justSmaller;
	                count++;
	            }
	        }
	        return count;
	    }

	public static void main(String[] args) {
		
		int[] coins = {186, 419, 83, 408};
		int amount = 6249;
		int count =  coinChange(coins, amount);
		System.out.println("Toatal no. of coins required : " +count);
		
		// TODO Auto-generated method stub

	}

	

}
