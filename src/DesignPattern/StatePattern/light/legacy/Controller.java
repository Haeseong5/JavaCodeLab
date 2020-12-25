package DesignPattern.StatePattern.light.legacy;

public class Controller {
    public static void main(String[] args) {
        LegacyLight light = new LegacyLight();
        light.off_button_pushed();
        light.on_button_pushed();
        light.on_button_pushed();
        light.on_button_pushed();
        light.on_button_pushed();
        light.off_button_pushed();
    }
}
