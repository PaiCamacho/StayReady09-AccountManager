package com.codedifferently.bankaccountlab;

public class CheckingAccount extends BankAccount {
    private String name;

    public CheckingAccount(String name, Double initialBalance) {
        super(initialBalance);
        this.accountFee = 52.00;
        this.name = name;
        this.accountBalance = initialBalance;

    }
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public Double getAccountFee() {
        return this.accountFee;
    }

    @Override
    public void deposit(Double amount) {
        if(isActive == true) {
            this.accountBalance += amount;
        }
    }

    @Override
    public Double getAccountBalance() {
        return this.accountBalance;
    }

    @Override
    public void withdrawMoney(Double amount) {
        if(isActive == true) {
            this.accountBalance -= amount;
        }

    }

}
