package com.decorator;

public abstract class Beverage {
    String description = "Unkonw Beverage";
    double size;
    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(String capacity) {
        if("tall".equals(capacity)) {
            size = .1;
        } else if("grande".equals(capacity)) {
            size = .15;
        } else {
            size = 0.2;
        }
    }

    public double getSize() {
        return this.size;
    }
}
