//Bank Account Class
package com.assg2;

public class BankAccount {
	int accountNumber;
    double accountBalance;
    String accountHolderName;
    String accountType;
    
    public BankAccount(int accountNumber, double accountBalance, String accountHolderName, String accountType) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }
    
    public void deposit(double amount) {
        accountBalance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient balance!");
        } else {
            accountBalance -= amount;
        }
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public String getAccountType() {
        return accountType;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount account = new BankAccount(99007788, 20000, "Ankitha", "Savings");
        
        
        account.deposit(500);
        
     
        account.withdraw(200);
        
  
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account balance: " + account.getAccountBalance());
        System.out.println("Account holder name: " + account.getAccountHolderName());
        System.out.println("Account type: " + account.getAccountType());

	}

}
