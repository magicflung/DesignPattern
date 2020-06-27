package com.template;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourIncup();
        if(hook()) {
            addCondiment();
        }
    }

    abstract void brew();

    abstract void addCondiment();

    void boilWater() {
        System.out.println("把水煮沸");
    }

    void pourIncup() {
        System.out.println("倒进杯子");
    }

    boolean hook() {
        return true;
    }
}
