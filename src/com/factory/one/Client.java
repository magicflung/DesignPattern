package com.factory.one;

public class Client {
    public static void main(String[] args) {
        SimpleBurgerFactory simpleBurgerFactory = new SimpleBurgerFactory();
        BurgerStore burgerStore = new BurgerStore(simpleBurgerFactory);
        burgerStore.orderBurger("牛肉汉堡");
        burgerStore.orderBurger("鸡腿汉堡");
    }
}
