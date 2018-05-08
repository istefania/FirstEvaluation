package com.example.stef.firstevaluation;

public class Account {
    int ID;
    int money;
    String owner;

    Account(int ID,int money,String owner){
        this.ID=ID;
        this.money=money;
        this.owner=owner;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
