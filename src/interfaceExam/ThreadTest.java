package interfaceExam;

public class ThreadTest {

    public static void main(String[] args) {
        Thread thread = new Thread(new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("thread1");
            }
        });
        thread.start();
    }
}
