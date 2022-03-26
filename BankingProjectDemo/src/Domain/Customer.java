package Domain;

public class Customer {

	private int bankAccountNumber;
	private String password;
	
	public Customer(int bankAccountNumber, String password) {
		this.bankAccountNumber = bankAccountNumber;
		this.password = password;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
