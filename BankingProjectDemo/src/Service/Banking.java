package Service;
import java.util.Scanner;

public class Banking {

	private double balance = 1000;
	private Scanner sc = new Scanner(System.in);
	
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println(amount + " deposited successfully.");
			System.out.println("Current Balance : " + balance);
		}
		else
			System.out.println("Invalid amount!!");
	}
	
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(amount + " withdrawn successfully.");
			System.out.println("Current Balance : " + balance);
		}
		else
			System.out.println("Insufficient balance!!");
	}
	
	public void transfer(double amount, int account) {
		System.out.println("Please enter the OTP :");
		OTPGenerator ot = new OTPGenerator();
		int generatedOTP = ot.generateOTP();
		System.out.println("OTP : " + generatedOTP);
		int OTP = sc.nextInt();
		
		if(OTP == generatedOTP) {
			if(balance >= amount) {
				balance -= amount;
				System.out.println(amount + " transfered successfully to " + account);
				System.out.println("Current Balance : " + balance);
			}
			else
				System.out.println("Insufficient balance!!");
		}
		else
			System.out.println("Invalid OTP!!");
	}
}
