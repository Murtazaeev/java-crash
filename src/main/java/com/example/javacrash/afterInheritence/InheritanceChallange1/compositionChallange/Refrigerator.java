package com.example.javacrash.afterInheritence.InheritanceChallange1.compositionChallange;

public class Refrigerator {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("I have an order");
            hasWorkToDo = false;
        }
    }
}
