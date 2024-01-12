package com.uber.object;
import java.util.Random;
import java.util.Date;
import java.util.Scanner;

public class Account{

    private Integer balance;
    public Integer accountID;
    public String clientName, clientId, clientEMail, clientPhone, clientAddress, accountType;
    public Date dtCreation;

    public Account(String name, String id, String eMail, String phone, String address) {
        this.accountID = setAccountID();
        balance = 0;
        System.out.println("this.accountID " + this.accountID + "\n");
    }

    private Integer setAccountID(){
        Random rand = new Random();
        return rand.nextInt(30);
    }

    public void depositMoney(Integer value){
        this.balance = this.balance + value;
    }

    public void withdrawMoney(Integer value){
        this.balance = this.balance - value;
    }

    public Integer getBalance(){
        return balance;
    }
    public String getType(){ return accountType; }
    public Integer getAccountID(){ return accountID; }
    public Date getDate(){ return dtCreation; }
    public String getName(){ return clientName; }

    public void setName(String name){ clientName = name; }
    public void setID(String ID){ clientId = ID; }
    public void setEmail(String eMail){ clientEMail = eMail; }
    public void setPhone(String phone){ clientPhone = phone; }
    public void setAddress(String address){ clientAddress = address; }
    public void setBalance(Integer value){ balance = value; }
    public void setDate(){ dtCreation = new Date(); }

    public void makeWithdraw(Integer value){ setBalance(getBalance() - value); }
    public void makeDeposit(Integer value){ setBalance(getBalance() + value); }

}
