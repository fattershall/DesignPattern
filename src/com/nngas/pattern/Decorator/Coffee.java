package com.nngas.pattern.Decorator;

/**
 * @author pengh
 * @date 2020-03-12 -23:14
 */
public class Coffee extends  Drink {


    @Override
    public float cost() {
        return super.getPrice();
    }
}
