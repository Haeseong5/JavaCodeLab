package DesignPattern.ObserverPattern.score.ui;

import DesignPattern.ObserverPattern.score.Observer;
import DesignPattern.ObserverPattern.score.ScoredRecord;

import java.util.List;

public class StatisticsView implements Observer {

    ScoredRecord scoredRecord;

    public StatisticsView(ScoredRecord scoredRecord){
        this.scoredRecord = scoredRecord;
    }

    @Override
    public void update() {
        List<Integer> record = scoredRecord.getScoreRecord(); //변경된 scores 리스트를 얻어서 표시
        displayScores(record);
    }

    private void displayScores(List<Integer> record) {
        int sum = 0;
        for (int i=0; i<record.size(); i++){
            sum += record.get(i);
        }
        int avg = sum/record.size();
        System.out.println("합:"+sum + " 평균: "+avg);
    }
}
