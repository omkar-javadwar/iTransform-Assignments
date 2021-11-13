package com.testing.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testWithdraw() {
		BankAccount bankAccount = new BankAccount(2000);
		assertThrows(InsufficientFundsException.class, () -> bankAccount.withdraw(20000));
	}
}
