package DesignPattern.ObserverPattern.score.legacy;

import java.util.Collections;
import java.util.List;

public class MinMaxView {
    private ScoredRecord scoredRecord;

    public MinMaxView(ScoredRecord scoredRecord){
        this.scoredRecord = scoredRecord;
    }

    public void update() { //점수의 변경을 통보받음
        List<Integer> record = scoredRecord.getScoreRecord(); //점수를 조회함
        displayMinMax(record);
    }

    public void displayMinMax(List<Integer> record) {
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("min: " + min + " max: " + max);
    }
}
