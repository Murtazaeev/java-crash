package com.example.javacrash.Person;

public class Person {

    private String firstName;
    private  String secondName;
    private int age;


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {

        if(age < 0 || age > 100) {
            return;
        } else {
        this.age = age;
        }
    }

    public boolean isTeen(){
        if(age > 12 && age < 20){
            return true;
        } else {
            return  false;
        }
    }

    public void getFullName() {
        if(firstName == null || secondName == null) System.out.println("one of the fields are null");

    }
}
