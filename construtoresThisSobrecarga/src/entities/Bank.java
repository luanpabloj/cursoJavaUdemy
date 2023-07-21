package entities;

public class Bank {

	private String name;
	private int numAccount;
	private double balance;
	
	public Bank(String name, int numAccount, double deposit) {
		this.name = name;
		this.numAccount = numAccount;
		depositValue(deposit);
	}
	
	public Bank(String name, int numAccount) {
		this.name = name;
		this.numAccount = numAccount;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumAccount() {
		return numAccount;
	}


	public double getBalance() {
		return balance;
	}



	public void depositValue(double deposit) {
		
		balance += deposit;
		
	}
	
	public void withDraw(double deposit) {
		balance -= deposit + 5;
	}
	
	public String toString() {
		return "Bank"
				+ "Account "
				+ numAccount
				+ ", Holder "
				+ name
				+ ", Balance: "
				+ balance;
	}
	
}
