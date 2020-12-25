package DesignPattern.StatePattern.light.state;


/**
 * Light 클래스에서는 추상화된 State 인터페이스만 참조하도록 하여 현재 어떤 상테에 있는지와 무관하게 코드를 작성할 수 있도록 함.
 * *Strategy 패턴에서는 어떤 전략을 사용하는지와 무관하게 함. State 패턴에서는 상태와 무관하게!
 *
 * Light 클래스에서는 상태 클레스에 작업을 위임만 하면 된다. 이전에 보았던 복잡한 조건식은 필요 없다.
 */

public class Light {
    /**
     * Light 클래스는 state 변수를 통해 현재 시스템의 상태 객체를 참조한다.
     * 상태에 따른 행위를 수행하려면, state 변수가 참조하는 상태 객체에 작업을 위임해야한다.
     * Light 클래슨느 구체적인 상태를 나타내는 객체를 참조하지 않는다. 즉, 시스템이 어떤 상태에 있는지와는 무관하다는 의미이다.
     */
    private State state;
    public Light() {
        state = OFF.getInstance(); //불이 꺼진 상태로 초기화
    }

    public void setState(State state){
        this.state = state;
    }

    public void on_button_pushed(){
        state.on_button_pushed(this);
    }

    public void off_button_pushed(){
        state.off_button_pushed(this);
    }
}
