package com.nngas.pattern.Adapter;

/**
 * @author pengh
 * 适配器例子：插头与插座 ，遇到国外不适用的插座，会带一个转换器,这个转换器就是适配器的例子
 * 通过转换器转换成其他的类型
 * 将一个类的接口转换成另一种接口，让原本接口不兼容的类可以兼容
 * 被适配对象通过适配器转换成目标对象
 * 用户角度是看不到被适配者的，是解耦的
 */
public class Adapter implements Duck {
    //对象适配器实现方式
    private WildTurkey wildTurkey;

    public Adapter(WildTurkey wildTurkey) {
        this.wildTurkey = wildTurkey;
    }

    @Override
    public void quack() {
        wildTurkey.yarn();
    }

    @Override
    public void fly() {
        for (int j = 0; j <6 ; j++) {
            wildTurkey.fly();
        }

    }
}
