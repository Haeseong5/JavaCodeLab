package interfaceExam;

/**
 * 하위 클래스를 상위 클래스 타입으로 인스턴스화 했을 때
 * - 하나의 상위클래스를 서로 다른 동작방식으로 실행하게 할 수 잇다.
 */
abstract class Calculator{
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    int _sum() {
        return this.left + this.right;
    }

    public abstract void sum();  
    public abstract void avg();

    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
    // 다형성이란 하나의 클래스(Calculator)가 다양한 동작 방법(ClaculatorDecoPlus, ClaculatorDecoMinus)을 가지고 있는데 이것을 다형성
    public static void execute(Calculator calculator){
        System.out.println("실행 결과");
        calculator.run();
    }
    public static void main(String[] args) { 
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
//        c1.run();
         
        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
//        c2.run();
        execute(c1);
        execute(c2);
    }

   
}