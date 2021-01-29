package sync;

import java.util.ArrayList;

/**
 * synchronized 함수는 두가지 문제점이 있다.
 * 1. synchronized 함수가 lock이 걸린다.
 * 2. synchronized 함수를 포함한 객체(this)에 lock이 걸린다.
 *
 * 해결방법
 * 1. SyncBlock1 객체를 하나 만든다
 * 2. SyncBlock1 객체에는 add() 함수가 있고, 내부에 동기화가 필요한 부분에만 synchronized(this) 블록으로 처리합니다.
 * 3. 두개의 thread로 동시에 생성한 SyncBlock1 객체의 add()함수를 호출합니다.
 */
public class SyncBlock1 {
    public ArrayList<Integer> mList = new ArrayList<>();

    public static void main(String[] agrs) throws InterruptedException {
        SyncBlock1 syncblock1 = new SyncBlock1();
        System.out.println("Test start!");
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                syncblock1.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                syncblock1.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(syncblock1.mList.size());
        System.out.println("Test end!");
    }

    public void add(int val) { /* * Code for synchronization is not needed * */
        synchronized (this) {
            if (!mList.contains(val)) {
                mList.add(val);
            }
        }
    }
}

