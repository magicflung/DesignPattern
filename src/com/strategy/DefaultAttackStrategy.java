package com.strategy;

public class DefaultAttackStrategy implements AttackStrategy {
    @Override
    public String attackMode() {
        return "单弹攻击";
    }
}
