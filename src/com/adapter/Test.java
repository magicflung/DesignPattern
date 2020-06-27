package com.adapter;



import java.util.ArrayList;
import java.util.Iterator;


public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        ListAdapter listAdapter = new ListAdapter(list.iterator());
        while(listAdapter.hasMoreElements()) {
            System.out.println(listAdapter.nextElement());
        }
    }
}
