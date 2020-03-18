package com.nngas.pattern.Factory;

/**
 * @author pengh
 * @date 2020-03-18 -23:33
 */
public class OrderPizza {
    AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory) {
        Pizzsa pizzsa = null;
        String ordertype ="";
        this.abstractFactory = abstractFactory;
        pizzsa = abstractFactory.CreatePissa(ordertype);
    }
}
