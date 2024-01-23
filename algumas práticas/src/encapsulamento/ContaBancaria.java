package encapsulamento;

public class ContaBancaria {

	private Integer accountNumber;
	private Double balance;
	
	public ContaBancaria(Integer accountNumber, Double balance) {
		if(accountNumber < 0 || balance < 0) {
           throw new IllegalArgumentException("Número da conta e saldo devem ser não negativos");
		}
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public double withdraw(Double withdraw) {
		if(withdraw > balance) {
			throw new IllegalArgumentException("O saldo não pode ficar negativo");
		}
		balance -= withdraw;
		return balance;
	}
	
	public double deposit(Double deposit) {
		if(deposit < 0) {
			throw new IllegalArgumentException("Não é permitido depositar valor menor que 0");
		}
		balance += deposit;
		return balance;
	}
}
