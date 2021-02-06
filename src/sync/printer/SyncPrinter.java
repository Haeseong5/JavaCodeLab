package sync.printer;

public class SyncPrinter implements Printer {
    private static Printer printer = null;
    private SyncPrinter(){}
    private int count = 0; //여러 쓰레드가 count 값에 동시에 접근할 수 있음

    //synchronized 는 객체에 lock 을 거는 것.
    //객체에 lock 이 걸리기 때문에 동시에 호출할 수 없다.
    //다중 스레드 환경에서 동시에 여러 쓰레드가 getPrinter()메서드를 소유하는 객체에 접근하는 것을 방지한다.
    //하지만 이런식으로 코딩하면, 성능이슈가 발생할 수 있음. 속도가 100배이상 느려질 수잇다.

    /**
     * 메서드 전체를 synchronized 키워드를 통해 임계 영역으로 지정하면 속도가 느려질 수 있다.
     * 따라서 메서드 보다는 synchronized 블럭으로 임계영역을 최소화해야한다.
     * printer가 null이 아니어도 계속해서 lock이 걸리기 때문에
     */
    public static synchronized Printer getPrinter(){
        if (printer == null){
            printer = new SyncPrinter();
        }
        return printer;
    }

    //Double Checking Locking을 써서 동기화 되는 부분을 줄이자

    /**
     * https://limkydev.tistory.com/67
     * 가능하면, 메서드 전체가 아니라 synchronized 블럭을 통해 임계영역을 최소화하는 것이 좋다.
     첫번째 if문에서 instance 가 null인 경우 synchronized 블럭에 접근하고
     한번 더 if문으로 instance가 null 유무를 체크합니다.
     2번 모두다 instance가 null인 경우에 new를 통해 인스턴스화 시킵니다.

     그 후에 instance가 null이 아니기 때문에 synchronized 블럭을 타지 않고, 바로 printer를 리턴
     이런 Double-checked locking기법을 통해 성능저하를 보완할 수 있습니다.
     */
    public static Printer getInstance(){
        if (printer == null){
            synchronized (Printer.class){
                if (printer==null){
                    printer = new SyncPrinter();
                }
            }
        }
        return printer;
    }

    @Override
    public void print(String str) {
        synchronized (this){
            count++;
            System.out.println(str+count);
        }
    }
}
