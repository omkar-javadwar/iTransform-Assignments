package com.testing.app;

public class BankAccount {
	long balance;

	public BankAccount(long balance) {
		this.balance = balance;
	}

	public void withdraw(long amount) {
		if (amount > balance)
			throw new InsufficientFundsException();
		else
			balance -= amount;
	}
}

class InsufficientFundsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

}
