package com.codedifferently.bankaccountlab;

import java.util.concurrent.atomic.AtomicInteger;

public class BusinessAccount extends BankAccount{
    private static AtomicInteger uniqueId = new AtomicInteger();
    private String businessName;
    private Integer taxId;

    public BusinessAccount(String businessName, Double initialBalance) {
        super(initialBalance);
        this.accountFee = 100.00;
        this.businessName = businessName;
        this.accountBalance = initialBalance;
        this.taxId = uniqueId.getAndIncrement();
    }

    public String getBusinessName(){
        return this.businessName;
    }

    public void setBusinessName(String businessName){
        this.businessName = businessName;
    }

    public Integer getTaxId(){
        return this.taxId;
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
