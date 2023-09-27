package com.example.javacrash.ConstructorsChallange;

public class Customer {

    public static void main(String[] args) {
        Customer customer = new Customer();
    }


    private String name;
    private int creditLimit;
    private String email;


    public Customer() {
        this("Temur", 2000, "t.meurope@gmail.com");
    }

    public Customer(String name, String email) {
        this(name, 2000, email);
        System.out.println();

    }

    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
