package com.template;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("咖啡滴过过滤器");
    }

    @Override
    void addCondiment() {
        System.out.println("添加糖");
    }
}
