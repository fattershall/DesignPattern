package com.nngas.pattern.Factory;

/**
 * @author pengh
 * @date 2020-03-18 -21:23
 */
public class BlackPissza extends Pizzsa {
    @Override
    public void prepare() {
        super.setName("BlackPissza");
        System.out.println(super.getName()+" is preparing");
    }
}
