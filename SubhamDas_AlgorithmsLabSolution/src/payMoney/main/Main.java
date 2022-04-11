package payMoney.main;

import java.util.Scanner;
import payMoney.classes.Transaction;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creating a new object of created class
		Transaction pmt = new Transaction();
		
		//Asking user to enter size of array
		System.out.println("Enter the size of transaction array: ");
		int size = sc.nextInt();
		
		//Initializing a new array for transaction values
		int[] arr = new int[size];
		//Asking user to enter values of transaction one by one
		System.out.println("Enter the values of array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Asking user to enter the number of targets
		System.out.println("Enter the number of targets that needs to be achieved: ");
		int targetNo = sc.nextInt();
		
		//Asking user to enter value of targets one by one
		for(int i = 0; i < targetNo; i++) {
			System.out.println("Enter the value of target: ");
			int target = sc.nextInt();
			//Calling method to get the number of transactions required
			pmt.transactionCounter(arr, target);				
		}
		sc.close();
	}
}