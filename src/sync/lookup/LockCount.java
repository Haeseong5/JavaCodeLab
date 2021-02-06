package sync.lookup;

import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 동시성 이슈 해결방법
 * 명시적 lock
 */
class LookCount {
    public static void main(String[] args) {
        Count count = new Count();
        for (int i = 0; i < 100; i++) {
            new Thread(){
                public void run(){
                    for (int j = 0; j < 100; j++) {
                        count.getLock().lock();
                        System.out.println(count.view());
                        count.getLock().unlock();
                    }
                }
            }.start();
        }
    }
}
class Count {
    private int count = 0;
    private Lock lock = new ReentrantLock();
    public int view() {
        return ++count;
    }
    public Lock getLock(){
        return lock;
    };
}