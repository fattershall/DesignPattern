package com.nngas.pattern.Factory;

/**
 * @author pengh
 * 将创建实例的方法变成抽象方法，具体的实现在子类中再实现
 *
 * 工厂方法：定义了一个创建对象的抽象方法，由子类决定要实例化的类，本方法将对象的实例化推迟到子类实现
 */
public abstract class FactoryMethod {
    public FactoryMethod() {
        Pizzsa pizzsa = null;
        String ordertype ;
        do {
            ordertype = gettype();
            pizzsa = createPissza();
        }
        while (true);
    }

    public abstract Pizzsa createPissza();

    public String gettype(){
        return "";
    }
}
