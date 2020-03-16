package com.nngas.pattern.singleton;

/**
 * @author pengh
 * @date 2020-03-16 -23:14
 */

//双重检查加锁法 最优算法
public class SingleTon3 {
    private volatile static SingleTon3 singleTon3 = null;

    private SingleTon3(){

    }
    private static  SingleTon3 getInstance(){
        if (null == singleTon3){
            synchronized (SingleTon3.class){
               if (null == singleTon3){
                   singleTon3 = new SingleTon3();
               }
            }
        }
        return  singleTon3;
    }

    public static void main(String[] args) {
        SingleTon3 s1 = SingleTon3.getInstance();
        SingleTon3 s2 = SingleTon3.getInstance();
        System.out.println("s1 = s2 "+ (s1 == s2));
    }
}
