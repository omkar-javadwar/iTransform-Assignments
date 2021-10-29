import java.util.Scanner;

class InsufficientBalanceException extends Exception {  
    public InsufficientBalanceException (String str) {  
        super(str);  
    }  
}

class IllegalBankTransactionException extends Exception {  
    public IllegalBankTransactionException (String str) {  
        super(str);  
    }  
}

public class SavingAccount {
	long id;
	double balance = 5000;
		
	double withdraw(double amount) {
		balance -= amount;
		return balance;
		
	}
	
	double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter operation should be performed either deposite or withdraw: ");
		String str = sc.nextLine();
		
		System.out.println("Enter userId: ");
		long userId = sc.nextLong();
			
		try {
			if(str.contentEquals("deposite")) {
				System.out.println("Enter Deposite Amount: ");
				double amount = sc.nextDouble();
				
				if (amount > 0) {
					System.out.println("Account Balance: "+ sa.deposit(amount));
				}
				else {
					throw new IllegalBankTransactionException("Illegal bank transaction...");
				}
				
			}
			else if(str.contentEquals("withdraw")) {
				System.out.println("Enter Withdraw Amount: ");
				double amount = sc.nextDouble();
				
				if (amount > sa.balance) {
					throw new InsufficientBalanceException("Insufficient balance...");
				}
				else if (amount < 0) {
					throw new IllegalBankTransactionException("Illegal bank transaction...");
				}
				else {
					System.out.println("Remaining balance is "+ sa.withdraw(amount));
				}
			}
			else {
				System.out.println("Choose valid operation!");
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*
Output:
Enter operation should be performed either deposite or withdraw: 
withdraw
Enter userId: 
1010
Enter Withdraw Amount: 
10000
InsufficientBalanceException: Insufficient balance...
	at SavingAccount.main(SavingAccount.java:60)
	
-----------------------------------------------------------------

Enter operation should be performed either deposite or withdraw: 
withdraw
Enter userId: 
1010
Enter Withdraw Amount: 
-500
IllegalBankTransactionException: Illegal bank transaction...
	at SavingAccount.main(SavingAccount.java:63)
 */
