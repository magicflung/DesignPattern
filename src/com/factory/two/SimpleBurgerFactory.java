package com.factory.two;

import com.factory.one.BeefBurger;
import com.factory.one.ChickenBurger;

public class SimpleBurgerFactory {
    public Burger createBurger(String type, String name) {
        Burger burger = null;
        if(type.equals("肯德基")) {
            if(name.equals("鸡腿汉堡")) {
                burger = new KFCChickenBurger();  // 前面加个KFC，表示是肯德基的产品
            } else if(name.equals("牛肉汉堡")) {
                burger = new KFCBeefBurger();
            } else if(name.equals("鲜虾汉堡")) {
                burger = new KFCShrimpBurger();
            }
        } else if(type.equals("麦当劳")) {
            if(name.equals("鸡腿汉堡")) {
                burger = new MChickenBurger(); // 前面加个M，表示是麦当劳的产品
            } else if(name.equals("牛肉汉堡")) {
                burger = new MBeefBurger();
            } else if(name.equals("鲜虾汉堡")) {
                burger = new MShrimpBurger();
            }
        }
        return burger;
    }
}
