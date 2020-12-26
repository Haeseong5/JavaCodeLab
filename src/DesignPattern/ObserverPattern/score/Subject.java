package DesignPattern.ObserverPattern.score;

import java.util.ArrayList;
import java.util.List;

/**
 * 성적 변경에 관심이 있는 대상 객체를 관리하는 Subject 클래스를 추가 정의
 * Subject 는 Observer 인터페이스를 구현함으로써 성적 변경에 관심이 있음을 보여준다.
 * Subject 클래스는 Observer 인터페이스를 통해 View 객체들의 update 메서드를 호출한다.
 */

//추상화된 변경 관심 대상 데이터
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>(); //추상화된 통보 대상 목록

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //통보 대상 목록, 즉 observers 의 각 옵저버에게 변경을 통보함
    public void notifyObservers() {
        for (Observer o:observers)
            o.update();
    }
}
