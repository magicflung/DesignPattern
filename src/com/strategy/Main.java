package com.strategy;

public class Main {

    public static void main(String[] args) {
        Aircraft role = new Aircraft();
        role.setAttack(new FireAttackStrategy());
        role.attackMode();
    }
}
