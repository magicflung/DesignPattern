package com.decorator.my.component;

import com.decorator.my.HotPot;

public class Shrimp extends Ingredients{

    HotPot hotPot;

    public Shrimp(HotPot hotPot) {
        this.hotPot = hotPot;
    }

    @Override
    public String getDescription() {
        return hotPot.getDescription() + ", 虾";
    }

    @Override
    public double cost() {
        return 25 + hotPot.cost();
    }
}
