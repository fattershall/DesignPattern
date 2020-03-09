package com.nngas.pattern.strategy;

/**
 * @author pengh
 * @date 2020-03-08 -21:55
 */
public class GoodFlyBehavior implements com.nngas.pattern.strategy.FlyBehavior {
    @Override
    public void Fly() {
        System.out.println("i am good at fly");
    }
}
