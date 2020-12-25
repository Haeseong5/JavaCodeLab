package DesignPattern.StatePattern.light.state;

public class LightController {

    public static void main(String[] args) {
        Light light = new Light();
        light.off_button_pushed();
        light.on_button_pushed();
        light.on_button_pushed();
        light.on_button_pushed();
        light.on_button_pushed();
        light.off_button_pushed();
    }
}
