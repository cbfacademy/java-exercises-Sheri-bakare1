package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    // it is best practice to use the numerical value
    private double interest = 3;

    // this is my constructor - super is calling the constructor of this class
    public SavingsAccount(double balance, String accountNumber) {
        super(accountNumber, balance);
    }
    //This method will add interest - super is calling the method of this class
    
    public double addInterest() {
        
        double interestToAdd = (super.getBalance()/100) * interest;
        return super.deposit(interestToAdd);

    }
}
