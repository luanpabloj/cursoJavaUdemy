package entities;

public class Bank {

	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Bank(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount > withdrawLimit) {
			System.out.println("Withdraw error: The amount exceeds withdraw limit");
		}
		else if(amount > balance) {
			System.out.println("Withdraw error: Not enough balance");
		}
		else {
			balance -= amount;
			System.out.println("Saque efetuado com sucesso: " + balance);
		}
	}
	
}
