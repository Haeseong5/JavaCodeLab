package DesignPattern.SingletonePattern.printer;

public class HSPrinter520 implements Printer{
    private static Printer printer = null;
    private HSPrinter520(){}

    public synchronized static Printer getPrinter(){
        if (printer != null){
            printer = new HSPrinter520();
        }
        return printer;
    }

    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
