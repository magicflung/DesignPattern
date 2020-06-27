package com.factory.two;

public abstract class BurgerStore {

    public void orderBurger(String name) {
        Burger burger = createBurger(name);

        burger.machining();
        burger.boxing();
        burger.end();
    }

    protected abstract Burger createBurger(String name);
}
