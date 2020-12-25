package DesignPattern.StrategyPattern.robot.strategy.attack.concrete;

import DesignPattern.StrategyPattern.robot.strategy.attack.AttackStrategy;

public class PunchStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("펀치 공격");
    }
}
