package interfaceExam;

interface Runnable {
    void run();
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread1.class.getSimpleName());
    }
}
class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread2.class.getSimpleName());
    }
}

/**
 * Runnable 를 구현한 객체가 어떤 객체이든
 * run() 함수를 호출할 수 있습니다
 */

public class Client {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.run();
        thread2.run();
    }
}
