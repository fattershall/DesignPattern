package com.nngas.pattern.Factory;

/**
 * @author pengh
 * @date 2020-03-18 -23:37
 */
public class PisszaStore {
    public static void main(String[] args) {
        OrderPizza pizza = new OrderPizza(new LDFactory());
    }
}
