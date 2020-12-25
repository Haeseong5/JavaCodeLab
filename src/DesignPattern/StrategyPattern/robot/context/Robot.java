package DesignPattern.StrategyPattern.robot.context;

import DesignPattern.StrategyPattern.robot.strategy.attack.AttackStrategy;
import DesignPattern.StrategyPattern.robot.strategy.move.MovingStrategy;

/**
 * 로봇 클래스는 이동과 공격을 실행하는 메서드가 있고, 이를 상속받아 구체적인 로봇을 만듦.
 *
 */
public abstract class Robot {
    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;

    public Robot (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack(){
        attackStrategy.attack();
    }

    public void move(){
        movingStrategy.move();
    }
}
