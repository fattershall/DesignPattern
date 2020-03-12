package com.nngas.pattern.Decorator;

/**
 * @author pengh
 * @date 2020-03-12 -23:25
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink drink ;
        drink = new LongBlack();
        System.out.println("order price "+ drink.cost());
        System.out.println("order desc "+ drink.getDescripions());

        drink = new Chocolate(drink);
        drink = new Chocolate(drink);
        System.out.println("order price "+ drink.cost());
        System.out.println("order desc "+ drink.getDescripions());
    }
}
