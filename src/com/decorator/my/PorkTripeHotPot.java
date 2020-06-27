package com.decorator.my;

public class PorkTripeHotPot extends HotPot {

    public PorkTripeHotPot() {
        description = "猪肚锅";
    }

    @Override
    public double cost() {
        return 80;
    }
}
