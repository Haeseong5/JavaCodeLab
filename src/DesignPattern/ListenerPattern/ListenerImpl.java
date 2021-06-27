package DesignPattern.ListenerPattern;

public class ListenerImpl implements Listener{
    @Override
    public void onEvent() {
        System.out.println("Hello World");
    }
}
