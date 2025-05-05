package model;

public class Account {
    protected String accountNumber;
    protected String ownerUsername;
    protected double balance;

    public Account(String accountNumber, String ownerUsername, double balance) {
        this.accountNumber = accountNumber;
        this.ownerUsername = ownerUsername;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwnerUsername() { return ownerUsername; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
