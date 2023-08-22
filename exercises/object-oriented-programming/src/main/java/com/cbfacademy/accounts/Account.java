package com.cbfacademy.accounts;

public class Account {
    private double balance;
    private final String accountNumber;
// This is the constructor: it will run when a new account obkect is created 
    public Account(String accountNumber, double balance) {

        this.balance = balance;
        this.accountNumber = accountNumber;
    }
// This is the getter - it let's me access and return the account balance stored in "balance" 
    public double getBalance() {
        return balance;
    }
//This method allows me to access and return the account number from outside the class
    public String getaccountNumber() {
        return accountNumber;
    }
//This method allows me to deposit money into the 
    public double deposit (double moneyIn) {
        if(moneyIn >= 0){
            this.balance += moneyIn;
            return this.balance;
    } else {
        throw new IllegalArgumentException("Money deposited must be above 0");
        
    }
}
    public double withdrawal (double moneyOut){
        if (moneyOut <=0) { 
            throw new IllegalArgumentException("Money Out must be above 0");

        } else if (moneyOut > balance) {
            throw new RuntimeException("balance should be above money withdrawn");
       
        } else {
           this.balance -= moneyOut;
           return this.balance;
        }
    }
}
// consider using protected rather thann private so the variables are still accessible so you don't have to say get.balance and can call the variable directly 
