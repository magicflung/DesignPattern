package com.strategy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aircraft aircraft = new Aircraft();
        // 默认单弹攻击方式
        aircraft.setAttack(new DefaultAttackStrategy());
        while(input.hasNext()) {
            String change = input.next();
            switch(change) {
                case "0": {
                    System.out.println("切换单弹攻击");
                    aircraft.setAttack(new DefaultAttackStrategy());
                    break;
                }
                case "1": {
                    System.out.println("切换双弹攻击");
                    aircraft.setAttack(new DoubleAttackStrategy());
                    break;
                }
                case "2": {
                    System.out.println("切换火焰攻击");
                    aircraft.setAttack(new FireAttackStrategy());
                    break;
                }
                case "3": {
                    System.out.println("大招：全屏攻击");
                    aircraft.setAttack(new FullScreenAttackStrategy());
                    break;
                }
                case "a": { // 输入a表示攻击
                    aircraft.attackMode();
                }
            }
        }
    }
}
