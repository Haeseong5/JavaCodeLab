package DesignPattern.StrategyPattern.robot;

import DesignPattern.StrategyPattern.robot.context.Robot;
import DesignPattern.StrategyPattern.robot.context.Diva;
import DesignPattern.StrategyPattern.robot.context.TaekwonV;
import DesignPattern.StrategyPattern.robot.strategy.attack.concrete.MissileStrategy;
import DesignPattern.StrategyPattern.robot.strategy.attack.concrete.PunchStrategy;
import DesignPattern.StrategyPattern.robot.strategy.move.concrete.FlyingStrategy;
import DesignPattern.StrategyPattern.robot.strategy.move.concrete.WalkingStrategy;

/**
 * 1. 클라이언트가 원하는 Strategy 객체를 생성하고, 이를 Context 객체에 바인딩하면
 *
 * 2. Context 객체는 바인딩된 Strategy 객체의 타입에 따라 적절한 행위를 실행한다.
 *
 * 같은 문제를 해결하는 여러 알고리즘이 클래스 별로 캡슐화되어 있고, 이들이 필요할 때 교체할 수 있도록함으로써 동일한 문제를 다른 알고리즘으로 해결할 수 있게 하는 디자인 패턴
 */
public class Client {
    public static void main(String[] args) {

        Robot taekwonV = new TaekwonV("태권브이");
        taekwonV.setAttackStrategy(new PunchStrategy());
        taekwonV.setMovingStrategy(new WalkingStrategy());

        Robot diva = new Diva("디바");
        diva.setAttackStrategy(new MissileStrategy());
        diva.setMovingStrategy(new FlyingStrategy());

        System.out.println(taekwonV.getName());
        taekwonV.attack();
        taekwonV.move();

        System.out.println(diva.getName());
        diva.attack();
        diva.move();

    }
}
