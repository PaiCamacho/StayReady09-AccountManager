package com.codedifferently.bankaccountlab;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class BankAccount {
    protected boolean isActive;
    protected static AtomicInteger uniqueAccountNumber = new AtomicInteger();
    protected Integer accountNumber;
    protected Double accountFee;
    protected Double accountBalance;


    public BankAccount(Double initialBalance){
        this.accountNumber = uniqueAccountNumber.getAndIncrement();
        this.isActive = true;
    }


    public abstract Integer getAccountNumber();

    public abstract Double getAccountFee();

    public abstract void deposit(Double amount);

    public abstract Double getAccountBalance();

    public abstract void withdrawMoney(Double amount);

    public Boolean getStatus(){
        return this.isActive;
    }

    public void closeAccount(){
        this.isActive = false;
        this.accountBalance = 0.0;
        this.accountFee = 0.0;
    }
}
