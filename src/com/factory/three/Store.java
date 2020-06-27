package com.factory.three;


public abstract class Store {
    public void orderBurger(String name) {
        Burger burger = createBurger(name);

        burger.machining();
        burger.boxing();
        burger.end();
    }

    public void orderFrenchFries() {
        FrenchFries frenchFries = createFrenchFries();

        frenchFries.machining();
        frenchFries.boxing();
        frenchFries.end();
    }

    protected abstract Burger createBurger(String name);

    protected abstract FrenchFries createFrenchFries();
}
