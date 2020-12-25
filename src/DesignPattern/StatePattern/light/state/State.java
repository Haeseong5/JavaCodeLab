package DesignPattern.StatePattern.light.state;

/**
 * Light 클래스에서는 추상화된 State 인터페이스만 참조하도록 하여 현재 어떤 상테에 있는지와 무관하게 코드를 작성할 수 있도록 함.
 * *Strategy 패턴에서는 어떤 전략을 사용하는지와 무관하게 함. State 패턴에서는 상태와 무관하게!
 *
 * Light 클래스에서는 상태 클레스에 작업을 위임만 하면 된다. 이전에 보았던 복잡한 조건식은 필요 없다.
 */

public interface State {
    public void on_button_pushed(Light light);
    public void off_button_pushed(Light light);
}