package com.nngas.pattern.Adapter;

/**
 * @author pengh
 * 类适配器方式实现：通过多重继承目标接口和被适配者类方式来实现适配
 *
 * 对象适配器使用组合的方式，类适配器使用继承的方式
 */
public class Adapter2 extends  WildTurkey implements  Duck{
    @Override
    public void quack() {
        super.yarn();
    }

    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
    }
}
