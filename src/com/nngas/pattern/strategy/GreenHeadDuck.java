package com.nngas.pattern.strategy;

/**
 * @author pengh
 * @date 2020-03-08 -21:58
 */
public class GreenHeadDuck extends com.nngas.pattern.strategy.Duck {
    public GreenHeadDuck() {
        flyBehavior = new com.nngas.pattern.strategy.GoodFlyBehavior();
        quckBehavior = new com.nngas.pattern.strategy.WawaQuackBehavior();
    }



    @Override
    public void display() {
        System.out.println("i am GreenHeadDuck");
    }

    public static void main(String[] args) {
        com.nngas.pattern.strategy.Duck greenHeadDuck = new GreenHeadDuck();
        greenHeadDuck.fly();
        greenHeadDuck.setFlyBehavior(new com.nngas.pattern.strategy.BadFlyBehavior());
        greenHeadDuck.fly();
        greenHeadDuck.quck();
        greenHeadDuck.display();

    }
}
