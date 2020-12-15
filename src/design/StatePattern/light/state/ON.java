package design.StatePattern.light.state;

import design.StatePattern.light.legacy.LegacyLight;

/**
 * Light 클래스의 상태인 ON과 OFF 를 캡슐화해 State 인터페이스를 구현
 * 이와 같은 상태클래스를 통해 메서드가 어떻게 실행되는지 쉽게 파악 가능
 * 상태 진입에 따라 on_button_pushed or off_button_pushed 메서드가 어떻게 실행되는지 쉽게 알 수 있다.
 */
public class ON implements State{
    private static final ON on = new ON();

    public static ON getInstance() {
        return on;
    }

    @Override
    public void on_button_pushed(Light light) {
        light.setState(SLEEP.getInstance());
        System.out.println("SLEEP MODE");
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off");
        light.setState(OFF.getInstance());
    }
}
