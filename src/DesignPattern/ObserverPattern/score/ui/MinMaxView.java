package DesignPattern.ObserverPattern.score.ui;

import DesignPattern.ObserverPattern.score.Observer;
import DesignPattern.ObserverPattern.score.ScoredRecord;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {
    private ScoredRecord scoredRecord;

    public MinMaxView(ScoredRecord scoredRecord){
        this.scoredRecord = scoredRecord;
    }

    public void displayMinMax(List<Integer> record) {
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("min: " + min + " max: " + max);
    }

    @Override
    public void update() { //점수의 변경을 통보받음
        List<Integer> record = scoredRecord.getScoreRecord(); //점수를 조회함
        displayMinMax(record);
    }
}
