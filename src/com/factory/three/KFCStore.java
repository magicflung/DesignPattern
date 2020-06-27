package com.factory.three;


public class KFCStore extends Store {
    @Override
    protected Burger createBurger(String name) {
        Burger burger = null;
        if(name.equals("鸡腿汉堡")) {
            burger = new KFCChickenBurger();
        } else if(name.equals("牛肉汉堡")) {
            burger = new KFCBeefBurger();
        } else if(name.equals("鲜虾汉堡")) {
            burger = new KFCShrimpBurger();
        }
        return burger;
    }
    // 因为只有一种薯条，所以不带参数
    @Override
    protected FrenchFries createFrenchFries() {
        return new KFCFrenchFries();
    }
}
