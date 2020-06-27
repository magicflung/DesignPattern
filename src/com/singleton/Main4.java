package com.singleton;

import java.util.Arrays;

public enum  Main4 {

    INSTANCE;

    public static void main(String[] args) {
        Main4 mainA = Main4.INSTANCE;
        Main4 mainB = Main4.INSTANCE;
        System.out.println(mainA == mainB);

        // 多线程实例
        for(int i = 0; i < 300; i++) {
            new Thread(() -> {
                System.out.println(Main4.INSTANCE);
            }).start();
        }
    }
}
