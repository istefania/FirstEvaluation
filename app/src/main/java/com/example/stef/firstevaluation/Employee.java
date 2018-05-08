package com.example.stef.firstevaluation;

public class Employee extends Person {

    int salary;
    String position;

    Employee(String name,int age,String gender,int salary,String position){
        super(name,age,gender);
        this.salary=salary;
        this.position=position;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
