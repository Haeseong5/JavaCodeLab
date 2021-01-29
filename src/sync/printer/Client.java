package sync.printer;

public class Client {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i=0; i<5; i++){
//                HSPrinter520.getPrinter().print("hs");
//                System.out.println(HSPrinter520.getPrinter().toString());
                System.out.println(RacePrinter.getPrinter());
                RacePrinter.getPrinter().print("hs");

            }
        }).start();
        new Thread(() -> {
            for (int i=0; i<5; i++){
//                System.out.println(HSPrinter520.getPrinter().toString());
//                HSPrinter520.getPrinter().print("sh");
                System.out.println(RacePrinter.getPrinter());
                RacePrinter.getPrinter().print("hs");

            }
        }).start();
    }
}
