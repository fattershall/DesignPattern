package com.nngas.pattern.Adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author pengh
 * @date 2020-03-23 -23:53
 * 枚举器到迭代器的适配器
 */
public class EnumerationIterator implements Iterator {
    private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw  new UnsupportedOperationException();
    }
}
