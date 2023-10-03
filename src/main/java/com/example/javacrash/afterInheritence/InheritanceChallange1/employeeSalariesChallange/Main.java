package com.example.javacrash.afterInheritence.InheritanceChallange1.employeeSalariesChallange;

import com.example.javacrash.afterInheritence.InheritanceChallange1.compositionChallange.SmartKitchen;

public class Main {

    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();


        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
