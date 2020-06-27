package com.decorator.my.component;

import com.decorator.my.HotPot;

public class Beef extends Ingredients {

    HotPot hotPot;

    public Beef(HotPot hotPot) {
        this.hotPot = hotPot;
    }

    @Override
    public String getDescription() {
        return hotPot.getDescription() + ", 牛肉";
    }

    @Override
    public double cost() {
        return 40 + hotPot.cost();
    }
}
