package sync;

public class DeadLock {
    public static Object object1 = new Object();
    public static Object object2 = new Object();

    public static void main(String[] args) {
        SubThread1 t1 = new SubThread1();
        SubThread2 t2 = new SubThread2();
        t1.start();
        t2.start();
    }

    private static class SubThread1 extends Thread {
        @Override
        public void run() {
            super.run();
            synchronized (object1){
                System.out.println("Thread1: Holding object1 ");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1: Waiting for object2 ");

                synchronized (object2){
                    System.out.println("Thread1: Holding object1&2 ");
                }
            }
        }
    }

    private static class SubThread2 extends Thread {
        @Override
        public void run() {
            super.run();
            synchronized (object2){
                System.out.println("Thread2: Holding object2 ");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2: Waiting for lock1 ");
                synchronized (object2){
                    System.out.println("Thread2: Holding lock1&2 ");
                }
            }
        }
    }
}
