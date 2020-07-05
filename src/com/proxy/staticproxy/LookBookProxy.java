package com.proxy.staticproxy;

/**
 * 需要去实现或者继承同一个接口或类
 */
public class LookBookProxy implements LookBook{
    // 通过聚合
    private LookBook lookBook;

    public LookBookProxy(LookBook lookBook) {
        this.lookBook = lookBook;
    }


    @Override
    public void study() {
        System.out.println("代理...");
        lookBook.study();
        System.out.println("老师讲授，扩展书外知识");
    }
}
