package AndroidActivity;

public class MainActivity extends Activity {

    public Button button;

    @Override
    public void onCreate() {
        super.onCreate();

        button = new Button();

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("버튼을 클릭했습니다.");
            }
        });

        button.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public void onLongClick(View v) {
                System.out.println("길게 버튼을 클릭했습니다.");
            }
        });


        new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(2000L);
                    button.callOnClick();
                    Thread.sleep(2000L);
                    button.performLongClick();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }.start();

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onRestart() {
        super.onRestart();
    }
}
