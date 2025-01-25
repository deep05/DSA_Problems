package problems;

import java.util.Scanner;

public class BasicTakeInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username ");
		
		String userName = sc.nextLine();
		System.out.println("Username : " +userName);
		// TODO Auto-generated method stub
		sc.close();

	}

}
