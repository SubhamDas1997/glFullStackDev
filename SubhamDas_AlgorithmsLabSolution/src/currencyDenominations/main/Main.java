package currencyDenominations.main;

import java.util.Scanner;
import currencyDenominations.classes.PaymentApproach;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Creating a new object of created class
		PaymentApproach pa = new PaymentApproach();
		
		//Asking user to enter size of denomination array
		System.out.println("Enter the size of currency denominations: ");
		int size = sc.nextInt();
		
		//Initializing a new array for currency denomination values
		int[] denoArr = new int[size];
		////Asking user to enter values of denominations one by one
		System.out.println("Enter the currecy denomination values: ");
		for(int i = 0; i < size; i++) {
			denoArr[i] = sc.nextInt();
		}
		
		//Asking user to enter the amount to be paid
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		
		//Calling method to get the payment approach
		pa.denoCount(denoArr, amount);
		sc.close();
	}
}