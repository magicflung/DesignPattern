package com.decorator.my;

public class SpicyHotPot extends HotPot {

    public SpicyHotPot() {
        description = "麻辣锅";
    }

    @Override
    public double cost() {
        return 30;
    }
}
