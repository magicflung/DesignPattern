package com.factory.one;

public class SimpleBurgerFactory {
    public Burger createBurger(String name) {
        Burger burger = null;
        if(name.equals("鸡腿汉堡")) {
            burger = new ChickenBurger();
        } else if(name.equals("牛肉汉堡")) {
            burger = new BeefBurger();
        } else if(name.equals("鲜虾汉堡")) {
            burger = new ShrimpBurger();
        }
        return burger;
    }
}
