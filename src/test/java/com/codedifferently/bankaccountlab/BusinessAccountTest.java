package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class BusinessAccountTest {
    @Test
    public void businessAccountConstructorTest(){
        //Given
        String expectedName = "Plates R Us";
        boolean expectedBool = true;
        Double expectedFees = 100.00;
        Double expectedBalance = 314.00;


        //When
        BusinessAccount account = new BusinessAccount("Plates R Us", 314.00);
        String actualName = account.getBusinessName();
        boolean actualBool = account.getStatus();
        Double actualFees = account.getAccountFee();
        Double actualBalance = account.getAccountBalance();
        BusinessAccount account1 = new BusinessAccount("Plant for Green", 30.00);

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBool, actualBool);
        Assert.assertEquals(expectedFees, actualFees);
        Assert.assertEquals(expectedBalance, actualBalance);
        Assert.assertNotEquals(account.getAccountNumber(), account1.getAccountNumber());
    }
    @Test
    public void setBusinessNameTest(){
        //Given
        String expectedName = "Plates";

        //When
        BusinessAccount account = new BusinessAccount("Plates R Us", 314.00);
        account.setBusinessName("Plates");
        String actualName = account.getBusinessName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void getNameTest(){
        //Given
        String expectedName = "Plates R Us";

        //When
        BusinessAccount account = new BusinessAccount("Plates R Us", 314.00);
        String actualName = account.getBusinessName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void getTaxIdTest(){
        //Given
        //When
        BusinessAccount account = new BusinessAccount("Plates R Us", 314.00);
        BusinessAccount account1 = new BusinessAccount("Plant for Green", 30.00);
        Integer expected = account.getTaxId();
        Integer actual = account1.getTaxId();
        //Then
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void getAccountNumberTest(){
        //Given
        //When
        BusinessAccount account = new BusinessAccount("Plates R Us", 314.00);
        BusinessAccount account1 = new BusinessAccount("Plant for Green", 30.00);
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
        BusinessAccount account = new BusinessAccount("Plates R Us", 314.00);
        boolean actualBool = account.getStatus();
        //Then
        Assert.assertEquals(expectedBool, actualBool);
    }
    @Test
    public void getAccountFeeTest(){
        //Given
        Double expectedFees = 100.00;
        //When
        BusinessAccount account = new BusinessAccount("Plates R Us", 314.00);
        Double actualFees = account.getAccountFee();
        //Then
        Assert.assertEquals(expectedFees, actualFees);
    }
    @Test
    public void getAccountBalanceTest(){
        //Given
        Double expectedBalance = 314.00;

        //When
        BusinessAccount account = new BusinessAccount("Plates R Us", 314.00);
        Double actualBalance = account.getAccountBalance();
        //Then
        Assert.assertEquals(expectedBalance, actualBalance);
    }
    @Test
    public void depositTest(){
        //Given
        Double expectedBalance = 330.00;

        //When
        BusinessAccount account = new BusinessAccount("Plates R Us", 315.00);
        account.deposit(15.00);
        Double actualBalance = account.getAccountBalance();
        //Then
        Assert.assertEquals(expectedBalance, actualBalance);
    }
    @Test
    public void withdrawMoneyTest(){
        //Given
        Double expectedBalance = 315.00;

        //When
        BusinessAccount account = new BusinessAccount("Plates R Us", 330.00);
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
        BusinessAccount account = new BusinessAccount("Plates R Us", 314.00);
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
