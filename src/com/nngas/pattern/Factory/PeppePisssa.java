package com.nngas.pattern.Factory;

/**
 * @author pengh
 * @date 2020-03-18 -21:21
 */
public class PeppePisssa extends  Pizzsa {
    @Override
    public void prepare() {
        super.setName("PeppePisssa");
        System.out.println(super.getName()+" is preparing");
    }
}
