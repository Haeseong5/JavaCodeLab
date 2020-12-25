package DesignPattern.StatePattern.light.legacy;

/**
 * 현재 코드 구조는 현재 시스템의 상태 변화를 파악하기에 용이하지 않다.
 * 새로운 상태가 추가되는 경우에 상태 변화를 초래하는 모든 메서드에 이를 반영하기 위해 코드를 수정해야만 한다.
 * 이를 위해서는 상태를 클래스로 분리해 캡슐화하도록 해야한다.
 * 상태에 의존적인 행위들도 상태 클래스에 같이두어 특정 상태에 따른 행위를 구현하도록 바꾼다.
 */
public class LegacyLight {
    private static final int ON = 0;
    private static final int OFF = 1;
    private static final int SLEEPING = 2;
    private int state;

    public LegacyLight(){
        state = OFF; // 초기 상태는 형광등이 꺼져있는 상태
    }

    public void off_button_pushed(){
        if (state == OFF) {
            System.out.println("반응 없음");
        }else if (state == SLEEPING){
            state = OFF;
            System.out.println("Light OFF");
        }else{
            state = OFF;
            System.out.println("Light OFF");
        }
    }

    public void on_button_pushed(){
        if (state == ON) {
            System.out.println("취침등 상태");
            state = SLEEPING;
        }else if (state == SLEEPING){
            state = ON;
            System.out.println("Light ON");
        }else{ //꺼져 있는 상태라면 켜진상태로 전환
            state = ON;
            System.out.println("Light ON");
        }
    }
}
