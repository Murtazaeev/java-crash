package com.example.javacrash.afterInheritence.InheritanceChallange1.compositionChallange;

public class DishWasher {

    private boolean hasWorkToDo;


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Im doing dishes!!");
            hasWorkToDo = false;
        }
    }
}
