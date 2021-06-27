package AndroidActivity;

public interface ActivityLifecycle {
    void onCreate();
    void onStart();
    void onResume();
    void onPause();
    void onStop();
    void onDestroy();
    void onRestart();
}
