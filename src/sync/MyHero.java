package sync;

/**
 * 1. synchronized 함수가 두개인 MyHero 클래스의 객체를 생성합니다.
 * 2. 두개의 thread가 객체의 sychronzied 함수인 batman() 과 superman()을 각각 백만번 호출 합니다.
 * 3. batman(), superman() 함수는 mHero란 멤버변수에 각각 다른 값을 세팅하고, 랜덤하게 sleep한 후에 값이 변했는지 체크합니다.
 * 4. 값이 변했다면 "synchronization broken" 메시지를 찍습니다. 
 */
public class MyHero {
    private String mHero;

    public static void main(String[] agrs) {
        MyHero tmain = new MyHero();
        System.out.println("Test start!");
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                tmain.batman();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                tmain.superman();
            }
        }).start();
        System.out.println("Test end!");
    }

    /**
     * 두개의 쓰레드가 각기 다른 함수를 호출하지만 객체에 락이 걸리기 때문에 동시에 호출할 수가 없다.

     */
    public synchronized void batman() {
        mHero = "batman";
        System.out.println(mHero);
        try {
            long sleep = (long) (Math.random() * 100);
            Thread.sleep(sleep);

            if (!"batman".equals(mHero)) {
            //다른 쓰레드가 mHero 에 접근했을 경우
                System.out.println("synchronization broken");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void superman() {
        mHero = "superman";
        System.out.println(mHero);
        try {
            long sleep = (long) (Math.random() * 100);
            Thread.sleep(sleep);
            if (!"superman".equals(mHero)) {
                System.out.println("synchronization broken");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

