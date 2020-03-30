package com.nngas.pattern.appearance;

/**
 * @author pengh
 * @date 2020-03-30 -23:24
 */
public class Stereo {
    private static Stereo stereo = null;

    private Stereo(){

    }
    public static  Stereo getInstance(){
        if (null == stereo){
            stereo = new Stereo();
        }
        return  stereo;
    }
    public void on(){
        System.out.println("Stereo  is on");
    }
    public void off(){
        System.out.println("Stereo is off");
    }
}
