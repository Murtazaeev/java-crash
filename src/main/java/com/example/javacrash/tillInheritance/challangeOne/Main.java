package com.example.javacrash.tillInheritance.challangeOne;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(12.25);
        System.out.println(account.getBalance());

        account.deposit(25.25);

        System.out.println(account.getBalance());

        account.withdraw(50);
        System.out.println(account.getBalance());
    }
}
