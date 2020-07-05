package com.proxy.dp;

public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        LookBook lookBookDao = new LookBookDao();
        // 创建代理对象，返回的类型可以强转
        LookBook proxyInstance = (LookBook) new ProxyFactory(lookBookDao).getProxyInstance();
        // 内存中就动态生成代理对象
        System.out.println(proxyInstance.getClass()); // 输出：class com.sun.proxy.$Proxy0，只要看到$Proxy0，说明是代理对象
        // 调用方法
        proxyInstance.study();
        // 调用有参方法
        String bookName = proxyInstance.hello("《HeadFirst设计模式》");
        System.out.println(bookName);
    }
}
