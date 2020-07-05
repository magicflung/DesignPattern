package com.proxy.dp;

public class LookBookDao implements LookBook {
    @Override
    public void study() {
        System.out.println("看书");
    }

    @Override
    public String hello(String bookName) {
        return "Hello " + bookName;
    }
}
