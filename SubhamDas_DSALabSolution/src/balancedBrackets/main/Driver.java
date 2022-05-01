package balancedBrackets.main;

import java.util.Scanner;
import balancedBrackets.classes.BalancedBrackets;

public class Driver {

	public static void main(String[] args) {
		//Creating a new object of scanner class
		Scanner sc = new Scanner(System.in);
		//Creating a new object of created class
		BalancedBrackets bb = new BalancedBrackets();
		
		//Taking string input from the user
		System.out.println("Enter the string of brackets: ");
		String str = sc.nextLine();
		
		if(bb.areBracketsBalanced(str))
			//If status is true, returning positive response
			System.out.println("The entered string has balanced brackets.");
		else
			//If status is true, returning negative response
			System.out.println("The entered string do not contain balanced brackets.");
		
		sc.close();
	}
}