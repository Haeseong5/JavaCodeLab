package sync.printer;

public class HSPrinter520 implements Printer {
    private static Printer printer = null;
    private HSPrinter520(){}
    private int count = 0; //여러 쓰레드가 count 값에 동시에 접근할 수 있음

    //synchronized 는 객체에 lock 을 거는 것.
    //객체에 lock 이 걸리기 때문에 동시에 호출할 수 없다.
    //다중 스레드 환경에서 동시에 여러 쓰레드가 getPrinter()메서드를 소유하는 객체에 접근하는 것을 방지한다.
    public static synchronized Printer getPrinter(){
        if (printer == null){
            printer = new HSPrinter520();
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
