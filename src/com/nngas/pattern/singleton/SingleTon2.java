package com.nngas.pattern.singleton;

import sun.security.jca.GetInstance;

/**
 * @author pengh
 * @date 2020-03-16 -23:11
 */
//饿汉模式
public class SingleTon2 {
    private static SingleTon2 singleTon2 = new SingleTon2();

    private SingleTon2(){

    }
    private static SingleTon2 getInstance(){
        return singleTon2;
    }
}
