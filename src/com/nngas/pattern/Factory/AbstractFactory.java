package com.nngas.pattern.Factory;

/**
 * @author pengh
 * 抽象工厂：定义了一个接口用于创建相关或有依赖关系的对象族，而无需明确指定具体类
 * 1  建立工厂的接口
 * 2 建立工厂族实现工厂的方法
 */
public interface AbstractFactory {
    public Pizzsa CreatePissa(String ordertyp);
}
