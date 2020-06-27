package com.template;
import	java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("咖啡滴过过滤器");
    }

    @Override
    void addCondiment() {
        System.out.println("添加糖");
    }


    public boolean hook() {
        return getUserInput();
    }

    private boolean getUserInput() {
        System.out.println("是否加糖（y/n）？");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        scanner.close();
        if(answer.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

}
