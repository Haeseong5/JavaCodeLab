package AndroidActivity;

public class Activity implements ActivityLifecycle{

    private State currentState;

    Activity(){
        currentState = State.INITIALIZED;
    }

    public State getCurrentState() {
        System.out.println(this.getClass().getSimpleName() + ": " + currentState);
        return currentState;
    }

    @Override
    public void onCreate() {
        System.out.println("onCreate()");
        currentState = State.CREATED;
        getCurrentState();
    }

    @Override
    public void onStart() {
        System.out.println("onStart()");
        currentState = State.STARTED;
        getCurrentState();
    }

    @Override
    public void onResume() {
        System.out.println("onResume()");
        currentState = State.RESUMED;
        getCurrentState();
    }

    @Override
    public void onPause() {
        System.out.println("onPause()");
        currentState = State.STARTED;
        getCurrentState();
    }

    @Override
    public void onStop() {
        System.out.println("onStop()");
        currentState = State.CREATED;
        getCurrentState();
    }

    @Override
    public void onDestroy() {
        System.out.println("onDestroy()");
        currentState = State.DESTROYED;
        getCurrentState();
    }

    @Override
    public void onRestart() {
        System.out.println("onRestart()");
        currentState = State.STARTED;
        getCurrentState();
    }
}
