package com.factory.one;

public class BurgerStore {

    SimpleBurgerFactory simpleBurgerFactory;

    public BurgerStore(SimpleBurgerFactory simpleBurgerFactory) {
        this.simpleBurgerFactory = simpleBurgerFactory;
    }

    public void orderBurger(String name) {
        Burger burger = simpleBurgerFactory.createBurger(name);

        burger.machining();
        burger.boxing();
        burger.end();
    }

}
