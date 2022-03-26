package Main;
import java.util.Scanner;
import Domain.Customer;
import Service.Banking;

public class BankingOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c1 = new Customer(12345, "Password");
		System.out.println("Welcome to INDIAN BANK!");
		System.out.println();
		System.out.println("Please enter account no :");
		int accountNumber = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.println("Please enter password :");
		String password = sc.nextLine();
		
		if(c1.getBankAccountNumber()==accountNumber && c1.getPassword().equals(password)) {
			Banking banking = new Banking();
			int option;
			int amount;
			
			do {
				System.out.println();
				System.out.println("Following operations can be performed:");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Transfer");
				System.out.println("4. Logout");
				
				option = sc.nextInt();
				
				switch(option) {
				case 1: System.out.println();
					System.out.println("Please enter an amount:");
					amount = sc.nextInt();
					banking.deposit(amount);
					break;
				case 2: System.out.println();
					System.out.println("Please enter an amount:");
					amount = sc.nextInt();
					banking.withdraw(amount);
					break;
				case 3: System.out.println();
					System.out.println("Please enter an account number:");
					int trnsAccNum = sc.nextInt();
					System.out.println();
					System.out.println("Please enter an amount:");
					amount = sc.nextInt();
					banking.transfer(amount, trnsAccNum);
					break;
				case 4: option = -1;
					break;
				}
			}while (option != -1);
			sc.close();
			System.out.println("Thank you! Transactions complete!");
		}else
			System.out.println("Invalid credentials!!");
	}
}