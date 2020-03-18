package com.nngas.pattern.Factory;

/**
 * @author pengh
 * @date 2020-03-18 -23:31
 */
public class LDFactory implements  AbstractFactory {
    @Override
    public Pizzsa CreatePissa(String ordertyp) {
        Pizzsa pizzsa = null;
        if (ordertyp.equals("black")){
            pizzsa = new BlackPissza();
        }
        else {
            pizzsa = new PeppePisssa();
        }
        return pizzsa;
    }
}
