package com.nngas.pattern.strategy;

/**
 * @author pengh
 * @date 2020-03-08 -21:54
 */
public class BadFlyBehavior implements  FlyBehavior {
    @Override
    public void Fly() {
        System.out.println("i am not good at fly");
    }
}
