package design.StatePattern.light.state;

public class SLEEP implements State {
    private static final SLEEP sleep = new SLEEP();

    public static SLEEP getInstance(){
        return sleep;
    }

    @Override
    public void on_button_pushed(Light light) {
        light.setState(ON.getInstance());
        System.out.println("LIGHT ON");
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("off");

    }
}
