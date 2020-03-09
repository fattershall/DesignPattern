package com.nngas.pattern.strategy;

/**
 * @author pengh
 * @date 2020-03-08 -20:47
 */
/*
    第一节：策略模式
    定义：分别封装行为接口，实现算法族，超类里存放接口对象，在子类里实现具体行为对象。
    原则：分离变化部分，封装接口，基于接口编程来实现各种功能，此模式让行为算法的变化独立于算法的使用者

    注意点：1 分析项目中的变化与不变化的部分
             变化部分抽象为接口，和生产为行为族，这些行为是不是可以变换的，行为之间替换，不通的
             多用组合，少用继承，用行为类的组合，而不是继承行为
             不变化部分
           2 设计模式没有框架的直接实现
     */
public abstract class Duck {
    public Duck() {
    }
    com.nngas.pattern.strategy.FlyBehavior flyBehavior;
    com.nngas.pattern.strategy.QuckBehavior quckBehavior;
    public abstract  void display();

    public void setFlyBehavior(com.nngas.pattern.strategy.FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuckBehavior(com.nngas.pattern.strategy.QuckBehavior quckBehavior) {
        this.quckBehavior = quckBehavior;
    }

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
