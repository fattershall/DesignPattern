package com.nngas.pattern.strategy;

/**
 * @author pengh
 * @date 2020-03-08 -20:47
 */
/*
    第一节：策略模式
    定义：分别封装行为接口，实现算法族，超类里存放接口对象，在子类里实现具体行为对象。
    原则：分离变化部分，封装接口，基于接口编程来实现各种功能，此模式让行为算法的变化独立于算法的使用者
     */
public abstract class Duck {
    public Duck() {
    }
    FlyBehavior flyBehavior;
    QuckBehavior quckBehavior;
    public abstract  void display();
    public void fly(){
        flyBehavior.Fly();
    }
    public void quck(){
        quckBehavior.Quck();
    }

    public void swing(){
        System.out.println("i am swinging .....");
    }

}
