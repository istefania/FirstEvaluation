package com.example.stef.firstevaluation;

public class Client extends Person {

    Account account;

    Client(String name,int age,String gender,Account account){
        super(name,age,gender);
        this.account=account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
