package com.uber.object;

public class Savings extends Account{
    public Savings(String name, String id, String eMail, String phone, String address) {
        super(name, id, eMail, phone, address);
        String typeAccount = "savings";
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

    public void setAccountType(){ this.accountType = "S"; }

}
