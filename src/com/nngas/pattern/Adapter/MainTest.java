package com.nngas.pattern.Adapter;

/**
 * @author pengh
 * @date 2020-03-23 -23:31
 */
public class MainTest {

    //对象适配器实现方式

    public static void main(String[] args) {
        Duck duck = new GreenHeardDuck();
        duck.quack();
        duck.fly();

        Turkey turkey = new WildTurkey();
        turkey.yarn();
        turkey.fly();

        Duck adpterduck = new Adapter(new WildTurkey());
        adpterduck.quack();
        adpterduck.fly();

        Duck adpterduck2 = new Adapter2();
        adpterduck2.quack();
        adpterduck2.fly();

    }

}
