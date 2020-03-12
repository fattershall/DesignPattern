package com.nngas.pattern.Decorator;

/**
 * @author pengh
 * @date 2020-03-11 -22:23
 *
 *一个超类 两个分支
 */
public abstract class Drink {
    private String descripions;
    private float price = 0f;

    public String getDescripions() {
        return descripions + this.getPrice();
    }

    public void setDescripions(String descripions) {
        this.descripions = descripions;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public   abstract  float cost();
}
