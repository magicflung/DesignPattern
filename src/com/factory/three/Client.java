package com.factory.three;

public class Client {
    public static void main(String[] args) {
        MStore mStore = new MStore();
        mStore.orderBurger("鸡腿汉堡");
        mStore.orderFrenchFries();

        KFCStore kfcStore = new KFCStore();
        kfcStore.orderBurger("牛肉汉堡");
        kfcStore.orderFrenchFries();
    }
}
