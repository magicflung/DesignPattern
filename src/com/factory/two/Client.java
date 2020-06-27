package com.factory.two;

public class Client {
    public static void main(String[] args) {
        KFCBurgerStore kfcBurgerStore = new KFCBurgerStore();
        kfcBurgerStore.orderBurger("牛肉汉堡");
        kfcBurgerStore.orderBurger("鸡腿汉堡");

        MBurgerStore mBurgerStore = new MBurgerStore();
        mBurgerStore.orderBurger("牛肉汉堡");
        mBurgerStore.orderBurger("鸡腿汉堡");
    }
}
