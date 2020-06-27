package com.singleton;



public class Main2 {

    private static volatile Main2 INSTANCE;

    private Main2() {}

    public  static Main2 getInstance() {
        if(INSTANCE == null) {
            // 这样的形式表示，对Main2类的所有对象加锁
            // 在if语句内加锁，这样加锁的同时保证性能不降损太多
            synchronized(Main2.class) {
                // 双重判断
                if(INSTANCE == null) {
                    try {
                        // 睡眠2毫秒
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Main2();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        // Main2 mainA = Main2.getInstance();
        // Main2 mainB = Main2.getInstance();
        // System.out.println(mainA == mainB);

        // 多线程实例
        for(int i = 0; i < 300; i++) {
            new Thread(() -> {
                System.out.println(Main2.getInstance());
            }).start();
        }
    }
}
