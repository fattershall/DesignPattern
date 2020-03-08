package com.nngas.pattern.strategy;

/**
 * @author pengh
 * @date 2020-03-08 -21:58
 */
public class GreenHeadDuck extends  Duck {
    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quckBehavior = new WawaQuackBehavior();
    }



    @Override
    public void display() {
        System.out.println("i am GreenHeadDuck");
    }

    public static void main(String[] args) {
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        greenHeadDuck.fly();
        greenHeadDuck.quck();
        greenHeadDuck.display();

    }
}
