package com.codedifferently.bankaccountlab;

public class SavingsAccount extends BankAccount{
    private String name;

    public SavingsAccount(String name, Double initialBalance) {
        super(initialBalance);
        this.name = name;
        this.accountFee = 10.00;
        this.accountBalance = initialBalance;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void rate(int year){
        this.accountBalance += year*12*20;
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
