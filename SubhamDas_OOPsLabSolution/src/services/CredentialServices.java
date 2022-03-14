package services;

import java.util.Random;

public class CredentialServices {
	
	public String generatePassword() {
		
		String capitals = "ABCDEFGHIHKLMNOPQRSTUVWXYZ";
		String smalls = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String specials = "!@#$%^&*";
		
		String passVault = capitals + smalls + nums + specials;
		char[] passChar = new char[8];
		
		Random random = new Random();
		
		for(int i=0; i<8; i++) {
			passChar[i] = passVault.charAt(random.nextInt(passVault.length()));
		}
		
		String pass = new String(passChar);
		return pass;
	}
	
	public String generateEmail(String firstName, String lastName, String dept) {
		
		String email = firstName + lastName + "@" + dept + ".dasinfotec.com";
		return email;
	}
	
	public void showCred(String firstName, String email, String pass) {
		
		System.out.println("Welcome " + firstName +", your generated credentials are as follows :");
		System.out.println("Email ----> " + email);
		System.out.println("Password ---> " + pass);
	}
}
