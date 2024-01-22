package com.uber;

import com.uber.object.Checking;
import com.uber.object.Savings;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static Integer operations(){
        Scanner opt = new Scanner(System.in);
        System.out.println("Type the desired option: \n" +
                "1 - Create account \n" +
                "2 - Check balance\n" +
                "3 - Make a deposit \n" +
                "4 - Make a withdraw \n" +
                "5 - Finish \n" );
        Integer option = Integer.valueOf(opt.nextLine());
        return option;
    }

    public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Integer accountID, value;
        Checking accountC = new Checking("","","","", "");
        Savings accountS = new Savings("","","","", "");

        Integer option = operations();

        while (option != 5){

            if (option ==1){
                //Create account
                System.out.println("What type of account do you want to create? (C for checking or S for saving)");
                String type = s.nextLine();

                if  (type.equals("C") && accountC.getDate() != null){
                    System.out.println("You already have a checking account with ID " + accountC.getAccountID() + "\n");
                } else if  (type.equals("S") && accountS.getDate() != null){
                    System.out.println("You already have a saving account with ID " + accountS.getAccountID() + "\n");
                } else {

                    System.out.println("Enter your name");
                    String name = s.nextLine();
                    System.out.println("Enter your ID");
                    String id = s.nextLine();
                    System.out.println("Enter your email");
                    String eMail = s.nextLine();
                    System.out.println("Enter your telephone");
                    String phone = s.nextLine();
                    System.out.println("Enter your address");
                    String address = s.nextLine();

                    if  (type.equals("C")){
                        accountC.createAccount(name, id, eMail, phone, address);
                        System.out.println("Checking account created: " + accountC.getAccountID() + "\n");
                    } else {
                        accountS.createAccount(name, id, eMail, phone, address);
                        System.out.println("Checking account created: " + accountS.getAccountID() + "\n");
                    }
                }

            } else if (option == 2){
                //Get account balance
                System.out.println("Enter your account ID");
                accountID = Integer.valueOf(s.nextLine());
                if (accountC.getAccountID() == accountID){
                    System.out.println("Your checking balance is: " + accountC.getBalance() + "\n");
                } else if (accountS.getAccountID() == accountID){
                    System.out.println("Your saving balance is: " + accountS.getBalance() + "\n");
                } else {
                    System.out.println("Account doesn't exist\n");
                }
            } else if (option == 3){
                // Make a deposit
                System.out.println("Op 3\n");
                System.out.println("Enter your account ID");
                accountID = Integer.valueOf(s.nextLine());
                System.out.println("Enter the deposit amount:");
                value = Integer.valueOf(s.nextLine());

                if (accountC.getAccountID() == accountID){
                    accountC.makeDeposit(value);
                    System.out.println("Deposit on checjing");
                } else if (accountS.getAccountID() == accountID){
                    accountS.makeDeposit(value);
                    System.out.println("Deposit on saving");
                } else {
                    System.out.println("Account doesn't exist\n");
                }

            } else if (option == 4){
                // Make a withdraw
                System.out.println("Op 4\n");
                System.out.println("Enter your account ID");
                accountID = Integer.valueOf(s.nextLine());
                System.out.println("Enter the deposit amount:");
                value = Integer.valueOf(s.nextLine());
                if (accountC.getAccountID() == accountID){
                    accountC.makeWithdraw(value);
                    System.out.println("with on checjing");
                } else if (accountS.getAccountID() == accountID){
                    accountS.makeWithdraw(value);
                    System.out.println("with on saving");
                } else {
                    System.out.println("Account doesn't exist\n");
                }
            }
            promptEnterKey();
            option = operations();

        }
    }

}