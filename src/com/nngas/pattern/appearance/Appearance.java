package com.nngas.pattern.appearance;

/**
 * @author pengh
 * 外观模式：定义了一个统一的接口，来访问子系统中一群功能相关的接口
 * 外观模式定义了一个高层接口，让子系统更加容易使用
 *
 * 最少知识原则：
 * 对象的方法调用范围
 * 1 该对象本身
 * 2 作为参数传进来的对象
 * 3 此方法创建和实例化的对象
 * 4 对象的组件
 */
public class Appearance {
    DVDPlayer dvdPlayer = null;
    Stereo stereo = null;
    public Appearance(){
        dvdPlayer = DVDPlayer.getInstance();
        stereo = Stereo.getInstance();
    }
    public void on(){
        dvdPlayer.on();
        stereo.on();
    }
    public void off(){
        dvdPlayer.off();
        stereo.off();
    }

    public static void main(String[] args) {
        Appearance appearance = new Appearance();
        appearance.on();
        appearance.off();
    }
}

