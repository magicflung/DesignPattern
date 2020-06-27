package com.decorator.my.component;

import com.decorator.my.HotPot;

public class Mutton extends Ingredients{

    HotPot hotPot;

    public Mutton(HotPot hotPot) {
        this.hotPot = hotPot;
    }

    @Override
    public String getDescription() {
        return hotPot.getDescription() + ", 羊肉";
    }

    @Override
    public double cost() {
        return 30 + hotPot.cost();
    }
}
