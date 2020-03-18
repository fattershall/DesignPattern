package com.nngas.pattern.Factory;

/**
 * @author pengh
 * @date 2020-03-18 -21:12
 */

/**
 * 简单工厂方法：为了解决对象实例化的问题，
 * 当有大量类需要实例化时候，将类的实例化放到一个工厂类中进行，封装实例化的过程
 * 定义了一个创建对象的类，用于封装创建对象实例化的行为
 */
public class Factory {

    public Pizzsa CreatePisszaFactory(String type) {
        Pizzsa pizzsa = null;
            if (type.equals("black")){
                pizzsa = new BlackPissza();
            }
            else if (type.equals("peppe")){
                pizzsa = new PeppePisssa();
            }
            return pizzsa;
    }
}
