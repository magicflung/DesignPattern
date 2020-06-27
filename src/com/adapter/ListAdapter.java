package com.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class ListAdapter implements Enumeration {

    Iterator iterator;

    public ListAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
