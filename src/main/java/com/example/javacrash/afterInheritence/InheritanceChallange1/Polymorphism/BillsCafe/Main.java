package com.example.javacrash.afterInheritence.InheritanceChallange1.Polymorphism.BillsCafe;

public class Main {

    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();
//
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("CHICKEN", "CHEESE", "KETCHUP");
//        burger.printItem();
        MealOrder meal = new MealOrder();
//        meal.printItemizedList();
        meal.addBurgerToppings("CHICKEN", "CHEESE", "KETCHUP");
        meal.printItemizedList();
    }
}
