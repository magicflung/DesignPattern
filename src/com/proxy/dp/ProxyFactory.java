package com.proxy.dp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        /**
         * newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
         * ClassLoader loader：当前目标对象的类加载器，获取加载器的方法是固定的
         * Class<?>[] interfaces：目标对象实现的接口类型，使用泛型的方式确认类型
         * InvocationHandler h：事情处理，执行目标对象的方法，会触发事件处理器方法，把当前执行的目标对象的方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() { // 反射
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始！！");
                        // 使用反射，调用目标对象的方法
                        // 返回执行的结果，如果没有返回值则返回null
                        Object returnValue = method.invoke(target, args);
                        System.out.println("JDK代理提交！！");
                        return returnValue;
                    }
                });
    }
}
