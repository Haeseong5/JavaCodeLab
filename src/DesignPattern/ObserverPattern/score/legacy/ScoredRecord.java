package DesignPattern.ObserverPattern.score.legacy;

import java.util.ArrayList;
import java.util.List;

/**
 * 입력하는 점수를 저장하는 클래스
 * 점수(데이터)가 추가(변경)됨에 따라 점수를 출력하기 위해서는 DataSheetView 객체를 참조해야한다.
 *
 * 현재 구조에서 다른 형태로 성적을 출력해야 하는 경우, ScoreRecord 클래스를 수정해야한다.
 */
public class ScoredRecord {
    private List<Integer> scores = new ArrayList<Integer>();

    //복수개의 DataSheetView
    private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>();
    private MinMaxView minMaxView;

    public void addDataSheetView(DataSheetView dataSheetView){
        dataSheetViews.add(dataSheetView);
    }

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }


    //데이터가 변경될 때 View 에게 통지한다.
    public void addScore(int score) { //새로운 점수를 추가
        scores.add(score); //점수 리스트에 점수 추가
        for (DataSheetView dataSheetView: dataSheetViews) //점수가 추가 됐을 때, scores 가 변경됨을 통보함
            dataSheetView.update();
        minMaxView.update();
    }

    public List<Integer> getScoreRecord(){
        return scores;
    }
}
