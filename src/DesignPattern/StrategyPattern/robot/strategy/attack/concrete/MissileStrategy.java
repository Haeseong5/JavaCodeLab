package DesignPattern.StrategyPattern.robot.strategy.attack.concrete;

import DesignPattern.StrategyPattern.robot.strategy.attack.AttackStrategy;

public class MissileStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("미사일 공격");
    }
}
