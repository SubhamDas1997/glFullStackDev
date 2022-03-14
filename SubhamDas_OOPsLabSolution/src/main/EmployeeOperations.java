package main;

import java.util.Scanner;
import domain.Employee;
import services.CredentialServices;

public class EmployeeOperations {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Subham", "Das");
		Scanner sc = new Scanner(System.in);
		CredentialServices cs = new CredentialServices();
		
		int option = 0;
		String dept,email,pass;
		
		while(option != -1) {
			
			System.out.println("Please enter your department from the following :");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resources");
			System.out.println("4. Legal");
			
			option = sc.nextInt();
			
			switch(option) {
			case 1 : dept = "tech";
				email = cs.generateEmail(e1.getFirstName(), e1.getLastName(), dept);
				pass = cs.generatePassword();
				cs.showCred(e1.getFirstName(), email, pass);
				break;
				
			case 2 : dept = "admin";
				email = cs.generateEmail(e1.getFirstName(), e1.getLastName(), dept);
				pass = cs.generatePassword();
				cs.showCred(e1.getFirstName(), email, pass);
				break;
				
			case 3 : dept = "hr";
				email = cs.generateEmail(e1.getFirstName(), e1.getLastName(), dept);
				pass = cs.generatePassword();
				cs.showCred(e1.getFirstName(), email, pass);
				break;
			
			case 4 : dept = "legal";
				email = cs.generateEmail(e1.getFirstName(), e1.getLastName(), dept);
				pass = cs.generatePassword();
				cs.showCred(e1.getFirstName(), email, pass);
				break;
				
			default : System.out.println("Invalid option!!");
				break;
			}
			option = -1;
			sc.close();
		}
	}
}
