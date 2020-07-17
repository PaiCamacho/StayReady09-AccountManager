package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {
    @Test
    public void savingsAccountConstructorTest(){
        //Given
        String expectedName = "Bob";
        boolean expectedBool = true;
        Double expectedFees = 10.00;
        Double expectedBalance = 314.00;


        //When
        SavingsAccount account = new SavingsAccount("Bob", 314.00);
        String actualName = account.getName();
        boolean actualBool = account.getStatus();
        Double actualFees = account.getAccountFee();
        Double actualBalance = account.getAccountBalance();
        SavingsAccount account1 = new SavingsAccount("Tom", 30.00);

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBool, actualBool);
        Assert.assertEquals(expectedFees, actualFees);
        Assert.assertEquals(expectedBalance, actualBalance);
        Assert.assertNotEquals(account.getAccountNumber(), account1.getAccountNumber());
    }
    @Test
    public void setNameTest(){
        //Given
        String expectedName = "Tom";

        //When
        SavingsAccount account = new SavingsAccount("Bob", 314.00);
        account.setName("Tom");
        String actualName = account.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void getNameTest(){
        //Given
        String expectedName = "Bob";

        //When
        SavingsAccount account = new SavingsAccount("Bob", 314.00);
        String actualName = account.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void getAccountNumberTest(){
        //Given
        //When
        SavingsAccount account = new SavingsAccount("Bob", 314.00);
        SavingsAccount account1 = new SavingsAccount("Tom", 30.00);
        Integer expected = account.getAccountNumber();
        Integer actual = account1.getAccountNumber();
        //Then
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void getStatusTest(){
        //Given
        boolean expectedBool = true;

        //When
        SavingsAccount account = new SavingsAccount("Bob", 314.00);
        boolean actualBool = account.getStatus();
        //Then
        Assert.assertEquals(expectedBool, actualBool);
    }
    @Test
    public void getAccountFeeTest(){
        //Given
        Double expectedFees = 10.00;
        //When
        SavingsAccount account = new SavingsAccount("Bob", 314.00);
        Double actualFees = account.getAccountFee();
        //Then
        Assert.assertEquals(expectedFees, actualFees);
    }
    @Test
    public void getAccountBalanceTest(){
        //Given
        Double expectedBalance = 314.00;

        //When
        SavingsAccount account = new SavingsAccount("Bob", 314.00);
        Double actualBalance = account.getAccountBalance();
        //Then
        Assert.assertEquals(expectedBalance, actualBalance);
    }
    @Test
    public void depositTest(){
        //Given
        Double expectedBalance = 330.00;

        //When
        SavingsAccount account = new SavingsAccount("Bob", 315.00);
        account.deposit(15.00);
        Double actualBalance = account.getAccountBalance();
        //Then
        Assert.assertEquals(expectedBalance, actualBalance);
    }
    @Test
    public void rateTest(){
        //Given
        Double expectedBalance = 555.00;
        //When
        SavingsAccount account = new SavingsAccount("Bob", 315.00);
        account.rate(1);
        Double actualBalance = account.getAccountBalance();

        //Then
        Assert.assertEquals(expectedBalance, actualBalance);
    }
    @Test
    public void withdrawMoneyTest(){
        //Given
        Double expectedBalance = 315.00;

        //When
        SavingsAccount account = new SavingsAccount("Bob", 330.00);
        account.withdrawMoney(15.00);
        Double actualBalance = account.getAccountBalance();
        //Then
        Assert.assertEquals(expectedBalance, actualBalance);

    }
    @Test
    public void closeAccountTest(){
        //Given
        boolean expectedBool = false;
        Double expectedBalance = 0.0;
        Double expectedFee = 0.0;
        //When
        SavingsAccount account = new SavingsAccount("Bob", 330.00);
        account.closeAccount();
        boolean actualBool = account.getStatus();
        Double actualBalance = account.getAccountBalance();
        Double actualFee = account.getAccountFee();

        //Then
        Assert.assertEquals(expectedBool, actualBool);
        Assert.assertEquals(expectedBalance, actualBalance);
        Assert.assertEquals(expectedFee, actualFee);
    }

}
