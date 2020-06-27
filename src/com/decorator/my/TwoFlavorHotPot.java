package com.decorator.my;

public class TwoFlavorHotPot extends HotPot {

    public TwoFlavorHotPot() {
        description = "鸳鸯锅";
    }

    @Override
    public double cost() {
        return 40;
    }
}
