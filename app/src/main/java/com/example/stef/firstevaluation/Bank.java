package com.example.stef.firstevaluation;

import java.util.ArrayList;

public class Bank {
        String name;
        String location;
        ArrayList<Employee> employees;
        ArrayList<Client> clients;
        ArrayList<Account> account;

        Bank(String name,String location,ArrayList<Employee> employee,ArrayList<Client> clients,ArrayList<Account> accounts){
            this.name=name;
            this.location=location;
            this.employees=employee;
            this.clients=clients;
            this.account=accounts;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
