package model;

import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private String accountNumber;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String type, String accountNumber, double amount) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    public String toString() {
        return type + "," + accountNumber + "," + amount + "," + timestamp;
    }
}
