package com.nngas.pattern.Factory;

/**
 * @author pengh
 * @date 2020-03-18 -21:18
 */
public abstract class Pizzsa {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  abstract void prepare();

    public void bake(){
        System.out.println(name+" is baking ");
    }

    public void box(){
        System.out.println(name+" is boxing");
    }
}
