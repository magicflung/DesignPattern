package com.singleton;

public class Main1 {
    private final static Main1 INSTANCE = new Main1();

    // 防止被其他人创建，将构造方法私有化
    private Main1(){}

    public static Main1 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        // Main1 mainA = Main1.getInstance();
        // Main1 mainB = Main1.getInstance();
        // System.out.println(mainA == mainB);

        // 多线程实例
        for(int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Main1.getInstance());
            }).start();
        }

    }
}
