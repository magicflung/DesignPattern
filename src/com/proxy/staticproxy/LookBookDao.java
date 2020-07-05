package com.proxy.staticproxy;

public class LookBookDao implements LookBook {
    @Override
    public void study() {
        System.out.println("看书");
    }
}
