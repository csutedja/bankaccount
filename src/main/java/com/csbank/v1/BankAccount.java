package com.csbank.v1;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

<<<<<<< Updated upstream
    public boolean deposit(int deposit) {
        if (deposit > 0){
            balance = balance + deposit;
=======
    public boolean deposit(int amount) {
        if (amount > 0){
            balance = balance + amount;
>>>>>>> Stashed changes
        } else {
            System.out.println("Invalid input.");
            return false;
        }
        return true;
    }

<<<<<<< Updated upstream
    public boolean withdraw(int withdraw) {
        if (withdraw <= 0) {
            System.out.println("Invalid input.");
            return false;
        } else if (balance - withdraw < 0) {
            System.out.println("Insufficient funds.");
            return false;
        } else {
            balance -= withdraw;
            return true;
        }
    }

}
    // run the test, see the compilation error, and construct the class
    // based on the requirements stated in the test.







=======
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
>>>>>>> Stashed changes
