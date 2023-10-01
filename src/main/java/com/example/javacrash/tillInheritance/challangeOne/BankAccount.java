package com.example.javacrash.tillInheritance.challangeOne;

public class BankAccount {

    private int number;
    private  double balance;
    private String name;

    private String email;
    private  String phoneNumber;

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println( depositAmount + " was successfully deposited");

    }

    public void withdraw(double withdrawAmount) {

        if(withdrawAmount > balance) {
            System.out.println("Insufficient amount in the balance to withdraw " + withdrawAmount);
        } else {
            balance -= withdrawAmount;
        }
    }
}
