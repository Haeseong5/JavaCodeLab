package design.StatePattern.light.state;

public class OFF implements State{
    private static final OFF off = new OFF(); // OFF 클래스의 인스턴스로 초기화됨.

    public static OFF getInstance() { // 초기화된 OFF 클래스의 인스턴스를 반환함
        return off;
    }

    @Override
    public void on_button_pushed(Light light) {
        light.setState(ON.getInstance());
        System.out.println("light on");
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("반응 없음");
    }
}
