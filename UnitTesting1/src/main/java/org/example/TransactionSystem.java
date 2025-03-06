package org.example;

public class TransactionSystem {
    private int balance;

    public TransactionSystem(int initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(int amount){
        if(amount > 0){
            this.balance += amount;
        }
        else {
            throw new IllegalArgumentException("deposit harus > 0");
        }
    }

    public void withDraw(double amount){
        if (amount > balance){
            throw new IllegalArgumentException("deposit harus > 0");
        }
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public void resetBalance(int amount){
        this.balance = amount;
    }

    public static void openCollection() {
        System.out.println("connection to server...");
    }
    public static void closeCollection() {
        System.out.println("close server...");
    }
}
