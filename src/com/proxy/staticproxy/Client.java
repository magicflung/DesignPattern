package com.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        LookBookDao lookBookDao = new LookBookDao();
        // 创建代理对象
        LookBookProxy lookBookProxy = new LookBookProxy(lookBookDao);
        // 看似操作的是代理对象，实际上操作的是目标对象，只不过我们不知道，而且代理对象还可以在原目标对象基础上扩展功能。
        lookBookProxy.study();
    }
}
