package com.proxy.cglib;



public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        LookBookDao lookBookDao = new LookBookDao();
        // 创建代理对象，返回的类型可以强转
        LookBookDao proxyInstance = (LookBookDao) new ProxyFactory(lookBookDao).getProxyInstance();
        // 内存中就动态生成代理对象
        System.out.println(proxyInstance.getClass()); // 输出：class com.sun.proxy.$Proxy0，只要看到$Proxy0，说明是代理对象
        // 调用代理对象的方法，触发interceptor方法，从而实现对目标对象的调用
        proxyInstance.study();

    }
}
