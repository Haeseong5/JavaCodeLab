package DesignPattern.StrategyPattern.robot.strategy.move.concrete;

import DesignPattern.StrategyPattern.robot.strategy.move.MovingStrategy;

public class FlyingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("나는 중");
    }
}
