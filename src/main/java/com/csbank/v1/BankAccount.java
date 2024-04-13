package com.csbank.v1;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            System.out.println("Invalid input.");
            return false;
        }
    }

    public int withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid input.");

        } else if (amount > balance) {
            System.out.println("Insufficient funds.");

        } else {
            balance -= amount;
            return amount;
        }
        return amount;
    }
}
