package com.nngas.pattern.appearance;

/**
 * @author pengh
 * 外观模式：定义了一个统一的接口，来访问子系统中一群功能相关的接口
 * 外观模式定义了一个高层接口，让子系统更加容易使用
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

