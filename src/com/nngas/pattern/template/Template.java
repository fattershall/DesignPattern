package com.nngas.pattern.template;

import java.lang.reflect.Method;

/**
 * @author pengh
 * @date 2020-04-27 -19:59
 * 模板模式：封装了一个算法步骤，其子类可以为其中的一个或多个步骤实现自己的的实现
 * 模板中的子类在不改变算法结构的情况下，可以重新定义某些步骤的实现 .moban
 */
public abstract class Template {
    public final void prepare() {
        methodA();
        methodB();
        methodC();
        methodD();

    }

    protected abstract void methodA();

    protected abstract void methodB();

    public void methodC() {
        System.out.println("this is C;");
    }

    public void methodD() {
        System.out.println("this is D");
    }


}

