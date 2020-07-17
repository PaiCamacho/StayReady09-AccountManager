package Demo;

import com.codedifferently.bankaccountlab.BankAccount;
import com.codedifferently.bankaccountlab.CheckingAccount;

import java.util.*;
public class MainApplication {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        boolean isDesiredPin = false;
        boolean hasChoice = false;
        HashMap<String, String> savedUserInfo = new HashMap<String, String>();
        double desiredMoney;
        String userName = "";
        String miscChoice = "";
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
                        userName = scanner.nextLine();
                        savedUserInfo.put(userName, desiredPin);
                        isDesiredPin = true;
                    }
                    else{
                        System.out.println("Please enter a valid pin");
                        desiredPin = scanner.nextLine();
                    }
                }
                System.out.println("How much money would you like to deposit initially?");
                desiredMoney = scanner.nextDouble();
                CheckingAccount account = new CheckingAccount(userName, desiredMoney);
                System.out.println("Here is your newly made bank information:");
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Name: " + account.getName());
                System.out.println("Your Balance: " + account.getAccountBalance());
                System.out.println("Your yearly Account Fee: " + account.getAccountFee());
                System.out.println("--------------------------------------");
                System.out.println();
                System.out.println("Would you like to DEPOSIT, WITHDRAW, or DELETE ACCOUNT");
                Scanner scan = new Scanner(System.in);
                miscChoice = scan.nextLine();
                while(!hasChoice) {
                    if (miscChoice.equalsIgnoreCase("DEPOSIT")) {
                        System.out.println("How much money would you like to Deposit?");
                        double deposit = scan.nextDouble();
                        account.deposit(deposit);
                    }
                    else if(miscChoice.equalsIgnoreCase("WITHDRAW")){
                        System.out.println("How much money would you like to Withdraw?");
                        double withdraw = scan.nextDouble();
                        account.withdrawMoney(withdraw);
                    }
                    else if(miscChoice.equalsIgnoreCase("DELETE ACCOUNT")){
                        System.out.println("You are now deleting your account.");
                        System.out.println("It was a pleasure doing business");
                        account.closeAccount();
                        System.out.println("Goodbye");
                        break;
                    }
                    System.out.println("Here is your updated bank information:");
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Name: " + account.getName());
                    System.out.println("Your Balance: " + account.getAccountBalance());
                    System.out.println("Your yearly Account Fee: " + account.getAccountFee());
                    System.out.println("--------------------------------------");
                    System.out.println();
                    System.out.println("Would you like to sign out now?\nYES\nNO");
                    Scanner scn = new Scanner(System.in);
                    String response = scn.nextLine();
                    if(response.equalsIgnoreCase("NO")){
                        System.out.println("Would you like to DEPOSIT, WITHDRAW, or DELETE ACCOUNT");
                        miscChoice = scan.nextLine();
                    }
                    else if(response.equalsIgnoreCase("YES")){
                        hasChoice = true;
                    }
                }
            }

        }
    }
}
