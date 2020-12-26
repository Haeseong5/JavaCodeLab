package DesignPattern.ObserverPattern.score.legacy;

import java.util.List;

/**
 * 점수를 목록의 형태로 출력하는 클래스
 */
public class DataSheetView {
    private ScoredRecord scoredRecord;
    private int viewCount;

    public DataSheetView(ScoredRecord scoredRecord, int viewCount){
        this.scoredRecord = scoredRecord;
        this.viewCount = viewCount;
    }

    public void update() { //점수의 변경을 통보받음
        List<Integer> record = scoredRecord.getScoreRecord(); //변경된 scores 리스트를 얻어서 표시
        displayScores(record);
    }

    private void displayScores(List<Integer> record) {
        for (int i=0; i<viewCount && i<record.size(); i++){
            System.out.println(record.get(i) + " ");
        }
        System.out.println();
    }
}
