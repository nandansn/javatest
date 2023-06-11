package com.nanda.oops.datahiding;

public class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (balance < amount) {
            throw new RuntimeException("Insufficient balance in your account:"+String.valueOf(this.accountNumber));
        } else {
            this.balance -= amount;
        }
        return amount;
    }
}
