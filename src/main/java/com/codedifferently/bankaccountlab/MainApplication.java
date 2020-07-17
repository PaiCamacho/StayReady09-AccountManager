package com.codedifferently.bankaccountlab;
import java.util.*;
public class MainApplication {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        boolean isDesiredPin = false;
        HashMap<String, String> savedUserInfo = new HashMap<String, String>();
        System.out.println("------ Welcome to Bank Your Way ATM ------");
        System.out.println("Would you like to:\nSIGN IN\nSIGN UP");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("SIGN UP")) {
            System.out.println("Would you like to open a:\nCHECKINGS ACCOUNT\nSAVINGS ACCOUNT\nBUSINESS ACCOUNT");
            String accountChoice = scanner.nextLine();
            if (accountChoice.equalsIgnoreCase("CHECKINGS ACCOUNT")) {
                System.out.println("What will your 4 digit pin be?");
                String desiredPin = scanner.nextLine();
                while(!isDesiredPin){
                    if (desiredPin.matches("[0-9]+") && desiredPin.length() == 4) {
                        System.out.println("What is your name?");
                        String userName = scanner.nextLine();
                        savedUserInfo.put(userName, desiredPin);
                        isDesiredPin = true;
                    }
                    else{
                        System.out.println("Please enter a valid pin");
                        desiredPin = scanner.nextLine();
                    }
                }


            }

        }
    }
}
