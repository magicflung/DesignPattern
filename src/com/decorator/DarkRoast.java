package com.decorator;

public class DarkRoast extends Beverage{

    public DarkRoast(String capacity) {
        description = "DarkRoast";
        setSize(capacity);
    }

    @Override
    public double cost() {
        return .99 + getSize();
    }
}
