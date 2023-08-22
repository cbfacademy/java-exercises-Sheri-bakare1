package com.cbfacademy.accounts;

public class Bank extends Account {

    private final static double MAX_OVERDRAFT_LIMIT = 1500;
    private double overdraftBalance;

// this is my constructor
    public CurrentAccount(double balance, String accountNumber) {
        super(accountNumber, balance);
        this.overdraftBalance = MAX_OVERDRAFT_LIMIT;
    }
    //this method will overide the my withdraw amount method in Account

    @Override
    public double withdrawal (double moneyOut){
        double overdraftLimit = super.getBalance()+ overdraftBalance; 
        if (moneyOut<= overdraftLimit) {
            return super.withdrawal(overdraftLimit);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
            return 0;
        }
        
    }
    
}
