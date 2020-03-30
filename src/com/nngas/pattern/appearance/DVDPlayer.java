package com.nngas.pattern.appearance;

/**
 * @author pengh
 * @date 2020-03-30 -23:21
 */
public class DVDPlayer {

    private static DVDPlayer dvdPlayer = null;

    private DVDPlayer(){

    }
    public static  DVDPlayer getInstance(){
        if (null == dvdPlayer){
            dvdPlayer = new DVDPlayer();
        }
        return  dvdPlayer;
    }
    public void on(){
        System.out.println("DVD player is on");
    }
    public void off(){
        System.out.println("DVD player is off");
    }
}
