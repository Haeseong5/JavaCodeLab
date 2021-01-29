package sync;

public class BasicSynchronization {
    private String mSharedResource;

    public static void main(String[] args) {
        BasicSynchronization temp = new BasicSynchronization();

        System.out.println("Test Start!");

        new Thread(() -> {
            for (int i=0; i<5; i++){
                temp.callMe("Thread1");
            }
        }).start();

        new Thread(()-> {
            for (int i=0; i<5; i++){
                temp.callMe("Thread2");
            }
        }).start();
        System.out.println("Test Finish!");
    }

    //함수에 synchronized를 걸면 그 함수가 포함된 해당 객체(this)에 lock을 거는것과 같습니다.
    public synchronized void callMe(String whoCallMe) {
        mSharedResource = whoCallMe;

        try {
            long sleep = (long) (Math.random() * 100);
            Thread.sleep(sleep);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(whoCallMe +" / "+ mSharedResource);

        //두개의 쓰레드가 mSharedResuorce에 접근하여 객체에 lock이 걸리기 때문에
        //동시에 해당 객체에 접근할 수 없다.
        if (!mSharedResource.equals(whoCallMe)){
            System.out.println(whoCallMe +" / "+ mSharedResource);
        }
    }


}
