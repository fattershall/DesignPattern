package com.nngas.pattern.template;

/**
 * @author pengh
 * @date 2020-04-27 -21:07
 */
public class Coffee extends  Template {
    @Override
    protected void methodA() {
        System.out.println("this is coffee A ;");
    }

    @Override
    protected void methodB() {
        System.out.println("this is coffee B");
    }
}
