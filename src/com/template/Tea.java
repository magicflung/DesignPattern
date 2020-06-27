package com.template;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("冲茶包");
    }

    @Override
    void addCondiment() {
        System.out.println("添加柠檬");
    }
}
