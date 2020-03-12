package com.nngas.pattern.Decorator;

/**
 * @author pengh
 * @date 2020-03-11 -21:45
 */

/**
 * 定义：装饰者模式：动态的将功能附加到对象身上，在扩展对象的功能方面，比继承更加具有弹性
 * 就像打包一个快递 装饰者用到了主体对象 用递归的方式来获取被装饰的对象
 * 1 主体：陶瓷、衣服 component
 * 2 包装：将填充物物品装箱、打包、放入泡沫 decorator
 */
public class Decorator extends  Drink {
    Drink obj ;
    public Decorator(Drink obj) {
        this.obj  = obj;
    }
    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDescripions() {
        return super.getDescripions() + super.getPrice() + "@@"+obj.getDescripions();
    }
}
