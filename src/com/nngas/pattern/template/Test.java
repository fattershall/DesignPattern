package com.nngas.pattern.template;

/**
 * @author pengh
 * @date 2020-04-27 -20:08
 */
public class Test {
    public static void main(String[] args) {
        Template tmp1 = new Coffee();
        Template tmp2 = new Tea();
        tmp1.prepare();
        tmp2.prepare();
        System.out.println("fal");
    }
}
