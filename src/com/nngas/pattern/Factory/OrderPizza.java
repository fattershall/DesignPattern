package com.nngas.pattern.Factory;

/**
 * @author pengh
 * 依赖抽象原则
 * 1 变量不要持有具体类的引用
 * 2 不要让类继承至具体的类，应该继承抽象类或者接口
 * 3 不要覆盖基类中已经实现的方法
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
