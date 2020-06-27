package com.factory.two;

import com.factory.one.BeefBurger;
import com.factory.one.ChickenBurger;
import com.factory.one.ShrimpBurger;

public class MBurgerStore extends BurgerStore {
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
}
