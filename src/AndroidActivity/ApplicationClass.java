package AndroidActivity;

import java.util.Stack;

public class ApplicationClass {

    static Stack<Activity> activityStack;


    public static void main(String[] args) {

        activityStack = new Stack<>();

        Activity mainActivity = new MainActivity();
        Activity subActivity = new SubActivity();
        startActivity(mainActivity);
        startActivity(subActivity);

        finish();
        finish();
    }

    public static void startActivity(Activity activity) {
        activityStack.add(activity);
        activity.onCreate();
        activity.onStart();
        activity.onResume();
    }

    public static void finish() {
         Activity activity = activityStack.pop();
         activity.onPause();
         activity.onStop();
         activity.onDestroy();
    }
}
