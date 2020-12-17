package design.CommandPattern.button;

interface Command {
    public abstract void execute();
}

class Button {
    private Command command;

    public Button(Command command){
        setCommand(command);
    }

    public void setCommand(Command newCommand){
        this.command = newCommand;
    }

    public void pressed(){ //버튼을 클릭하면, Command의 execute 메서드 호출.
        command.execute();
    }
}

class Lamp {
    public void turnOn(){
        System.out.println("Lamp On");
    }
}

class LampOnCommand implements Command{
    private Lamp lamp;
    public LampOnCommand(Lamp lamp){
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}

class Alarm {
    public void start(){
        System.out.println("Alarming...");
    }
}

class AlarmOnCommand implements Command{
    private Alarm alarm;
    public AlarmOnCommand(Alarm alarm){
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}

public class Client {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);
        Button button2 = new Button(alarmOnCommand);
        button2.pressed();

        button2.setCommand(lampOnCommand);
        button2.pressed();
    }
}