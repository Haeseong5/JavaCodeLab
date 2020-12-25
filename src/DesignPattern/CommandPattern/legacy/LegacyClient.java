package DesignPattern.CommandPattern.legacy;

class Lamp{
    public void turnOn(){
        System.out.println("Lamp On");
    }
}

class Alarm {
    public void start() {
        System.out.println("Alarming...");
    }
}

enum Mode { LAMP , ALARM }

class Button{
    private Lamp theLamp;
    private Alarm theAlarm;
    private Mode theMode;

    public Button(Lamp lamp, Alarm alarm){
        theAlarm = alarm;
        theLamp = lamp;
    }

    public void setMode(Mode mode){
        theMode = mode;
    }

    public void pressed(){
        switch (theMode){
            case LAMP -> theLamp.turnOn();
            case ALARM -> theAlarm.start();
        }
    }
}

/**
 * 버튼을 누르는 동작에 따라 다른 기능을 실행하는 경우.
 * 버튼을 눌렀을 때 기능을 변경하기 위해 Button 클래스의 코드를 수정해야 한다.
 * 즉, 버튼 클래스에 새로운 기능을 추가할 때 마다 코드를 수정해야 한다면 Button 클래스는 재사용하기 어렵다.
 *
 * 해결책: 버튼을 눌럿을 때 실행되는 기능을 Button 클래스 외부에서 제공받아 캡슐화해 pressed 메서드에서 호출하는 방법.
 */
public class LegacyClient {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Alarm alarm = new Alarm();
        Button button = new Button(lamp, alarm);

        button.setMode(Mode.LAMP);
        button.pressed();

        button.setMode(Mode.ALARM);
        button.pressed();
    }
}
