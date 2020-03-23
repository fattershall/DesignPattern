package com.nngas.pattern.Adapter;

/**
 * @author pengh
 * @date 2020-03-23 -23:26
 */
public class GreenHeardDuck implements  Duck {
    @Override
    public void quack() {
        System.out.println("i am gagaing");
    }

    @Override
    public void fly() {
        System.out.println("i am fly a short distance");
    }
}
