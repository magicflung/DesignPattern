package com.factory.three;


public class MStore extends Store {
    @Override
    protected Burger createBurger(String name) {
        Burger burger = null;
        if(name.equals("鸡腿汉堡")) {
            burger = new MChickenBurger();
        } else if(name.equals("牛肉汉堡")) {
            burger = new MBeefBurger();
        } else if(name.equals("鲜虾汉堡")) {
            burger = new MShrimpBurger();
        }
        return burger;
    }


    @Override
    protected FrenchFries createFrenchFries() {
        return new MFrenchFries();
    }
}
