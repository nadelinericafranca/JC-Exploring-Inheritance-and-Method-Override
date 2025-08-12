package org.example;

public class BankAccount {
    protected double balance;

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
}
