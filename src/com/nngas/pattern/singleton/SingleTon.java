package com.nngas.pattern.singleton;

/**
 * @author pengh
 * @date 2020-03-16 -22:40
 */

/**
 * 单例模式:有些地方的对象只需要一个，且多个实例会造成冲突和结果不一致等情况下 会使用到单例模式
 * 确保一个类只有一个实例对象，且提供了一个全局访问点
 * 1 构造函数设定为private 确保外部不会多次构造对象
 * 2
 */

// 懒汉模式 会有线程安全问题
public class SingleTon {
    private static SingleTon singleTon = null ;
    private SingleTon(){

    }
    private static synchronized SingleTon getInstance(){
        if (null == singleTon){
            singleTon = new SingleTon();
        }
        return  singleTon;
    }
}
