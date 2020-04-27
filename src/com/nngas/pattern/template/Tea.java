package com.nngas.pattern.template;

/**
 * @author pengh
 * @date 2020-04-27 -20:07
 */
public class Tea extends  Template {
    @Override
    protected void methodA() {
        System.out.println("this is Tea A;");
    }

    @Override
    protected void methodB() {
        System.out.println("this is Tea B");
    }
}
