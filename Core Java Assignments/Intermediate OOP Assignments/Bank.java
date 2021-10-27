class Account{
	public void balance() {
	}
}

class Saving extends Account{
	public double balance(double amount) {
		return amount;
	}
}

class Current extends Account{
	public double balance(double amount) {
		return amount;
	}
}

public class Bank {
	public static void main(String[] args) {
		Saving s = new Saving();
		double savingBalance =  s.balance(1500.60);

		Current c = new Current();
		double currentBalance = c.balance(2860.40);
		
		double totalCash = savingBalance + currentBalance;
		System.out.println("Total Cash in Bank: " + totalCash);
	}
}

/* 
Output:
Total Cash in Bank: 4361.0
*/
