package DesignPattern.ObserverPattern.score.legacy;

/**
 * [문제점]
 * 데이터의 통보대상이 변경된 것을 반영하기 위해 ScoredRecord 클래스의 코드를 수정해야 한다.
 * 예를 들어, 평균/표준 편차를 출력하는 클래스에게 성적변경을 통보하려면 ScoredRecord 를 다시 변경해야한다.
 *
 * [해결책]
 * 성적 통보 대상이 변경(추가/삭제)되더라도 ScoreRecord 클래스를 그대로 재사용할 수 있어야 한다.
 * 따라서 Scored 클래스에서 변화되는 부분을 식별하고, 이를 일반화 시켜야한다.
 */
public class Client {
    public static void main(String[] args) {
        ScoredRecord scoredRecord = new ScoredRecord();

        DataSheetView dataSheetView3 = new DataSheetView(scoredRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoredRecord, 5);

        MinMaxView minMaxView = new MinMaxView(scoredRecord);

        scoredRecord.addDataSheetView(dataSheetView3);
        scoredRecord.addDataSheetView(dataSheetView5);
        scoredRecord.setMinMaxView(minMaxView);

        for (int i=0; i<=5; i++){
            //데이터가 추가될 때 마다 , dataSheetView3 / dataSheetView5 / minMaxView 의 값이 출력됨
            scoredRecord.addScore(i*10);
        }

    }
}
