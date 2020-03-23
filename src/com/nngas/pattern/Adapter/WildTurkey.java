package com.nngas.pattern.Adapter;

/**
 * @author pengh
 * @date 2020-03-23 -23:28
 */
public class WildTurkey implements Turkey {
    @Override
    public void yarn() {
        System.out.println("i am guguing");
    }

    @Override
    public void fly() {
        System.out.println("i am fly a long distance");
    }
}
