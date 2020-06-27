package com.decorator.my;

public abstract class HotPot {
    String description;

    public String getDescription() {
        return description;
    }

    // 价钱
    public abstract double cost();
}
