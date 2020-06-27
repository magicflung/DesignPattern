package com.singleton;




public class Main3 {

    private Main3() {}

    private static class Main3Holder {
        private final static Main3 INSTANCE = new Main3();
    }

    public static Main3 getInstance() {
        return Main3Holder.INSTANCE;
    }

    public static void main(String[] args) {
        // Main3 mainA = Main3.getInstance();
        // Main3 mainB = Main3.getInstance();
        // System.out.println(mainA == mainB);

        // 多线程实例
        for(int i = 0; i < 300; i++) {
            new Thread(() -> {
                System.out.println(Main2.getInstance());
            }).start();
        }
    }
}
