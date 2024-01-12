package com.uber.object;

public class Checking extends Account{


    public Checking (String name, String id, String eMail, String phone, String address) {
        super(name,id,eMail,phone,address);
        //new Account(name,id,eMail,phone,address);
        String typeAccount = "checking";
    }

    public void createAccount(String name, String id, String eMail, String phone, String address){
        setName(name);
        setID(id);
        setEmail(eMail);
        setPhone(phone);
        setAddress(address);
        setAccountType();
        setDate();
    }

    public void setAccountType(){ this.accountType = "C"; }
}