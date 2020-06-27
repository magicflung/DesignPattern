package com.adapter;
import	java.awt.Composite;

public class Client {
    public static void main(String[] args) {
        // 组件
        CHTwoSocket chTwoSocket = new CHTwoSocket();
        // 适配器（将双头插包装进三头查中，使得双头插可以在三头插使用）
        ThreeSocket socketAdapter = new SocketAdapter();

        socketAdapter.name();


    }
}
