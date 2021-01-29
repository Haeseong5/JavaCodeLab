package Callback.listener;

public class MainController {
    public static void main(String[] args) {
        Listener myListener = new ListenerImpl();
        myListener.onEvent();
    }
}
