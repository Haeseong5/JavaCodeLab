package sync.printer;

public class RacePrinter implements Printer {
    private static Printer printer = null;
    private RacePrinter(){}
    private int count = 0;

    //synchronized 는 객체에 lock 을 거는 것.
    //객체에 lock 이 걸리기 때문에 동시에 호출할 수 없다.
    public static Printer getPrinter(){
        if (printer == null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printer = new RacePrinter();
        }
        return printer;
    }

    @Override
    public void print(String str) {
        count++;
        System.out.println(count+str);
    }
}
