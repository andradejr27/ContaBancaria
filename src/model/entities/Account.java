package model.entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
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

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if ((amount <= withdrawLimit) && (amount <= balance)) {
			this.balance -= amount;
			System.out.println("New balance: " + balance);
		}
		else if (amount > withdrawLimit) {
			System.out.println("Withdraw error: The amount exceeds withdraw limit");
		}
		else if (amount > balance) {
			System.out.println("Withdraw error: Not enough balance");
		}

	}

}
