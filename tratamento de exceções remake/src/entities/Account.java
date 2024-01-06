package entities;

import exceptions.AccountExceptions;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws AccountExceptions {
		if(balance < 0) {
			throw new AccountExceptions("The entered value is less than 0");
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void Deposit(Double amount) {
		if(amount < 0) {
			new AccountExceptions("The entered value is less than 0");
		}
		
		balance+= amount;
	}
	
	public void Withdraw (Double amount) throws AccountExceptions {
		if(amount > withdrawLimit) {
			throw new AccountExceptions("The amount exceeds withdraw limit");
		}
		if(amount < 0) {
			throw new AccountExceptions("The entered value is less than 0");
		}
		if(amount > balance) {
			throw new AccountExceptions("Not enough balance");
		}
	}
	
	public String toString() {
		return "New Balance: " + String.format("%.2f", balance);
	}
	
}
