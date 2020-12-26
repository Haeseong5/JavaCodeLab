package DesignPattern.ObserverPattern.score;

import java.util.ArrayList;
import java.util.List;

/**
 * 입력하는 점수를 저장하는 클래스
 * 구체적인 변경 감시 대상 데이터
 */
public class ScoredRecord extends Subject{
    private List<Integer> scores = new ArrayList<Integer>();

    //데이터가 변경될 때 View 에게 통지한다.
    public void addScore(int score) { //새로운 점수를 추가
        scores.add(score); //점수 리스트에 점수 추가
        //데이터가 변경되면 Subject 클래스의 notifyObservers 메서드를 호출해
        // 각 옵저버에게 데이터 변경을 통보
        notifyObservers();
    }

    public List<Integer> getScoreRecord(){
        return scores;
    }
}
