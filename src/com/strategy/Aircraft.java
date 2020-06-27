package com.strategy;

public class Aircraft {
    private AttackStrategy attack;

    public void setAttack(AttackStrategy attack) {
        this.attack = attack;
    }

    public void attackMode() {
        System.out.println(attack.attackMode());
    }

}
