package com.nngas.pattern.Decorator;

/**
 * @author pengh
 * @date 2020-03-12 -23:22
 */
public class Chocolate extends  Decorator {


    public Chocolate(Drink obj) {
        super(obj);
        super.setPrice(3.0f);
        super.setDescripions("Chocolate");
    }
}
