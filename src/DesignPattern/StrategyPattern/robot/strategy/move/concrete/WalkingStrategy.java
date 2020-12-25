package DesignPattern.StrategyPattern.robot.strategy.move.concrete;

import DesignPattern.StrategyPattern.robot.strategy.move.MovingStrategy;

public class WalkingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("걷는 중");
    }
}
