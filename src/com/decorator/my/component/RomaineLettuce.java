package com.decorator.my.component;

import com.decorator.my.HotPot;

public class RomaineLettuce extends Ingredients {

    HotPot hotPot;

    public RomaineLettuce(HotPot hotPot) {
        this.hotPot = hotPot;
    }

    @Override
    public String getDescription() {
        return hotPot.getDescription() + ", 生菜";
    }

    @Override
    public double cost() {
        return 10 + hotPot.cost();
    }
}
