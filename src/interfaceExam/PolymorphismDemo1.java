package interfaceExam;

class Parent {
    int a = 3;
    public String x(){return "Parent.x";}
}
class Child1 extends Parent {
    int b= 3;
    public String x(){return "Child1.x";}
    public String y(){return "y";}
}
class Child2 extends Parent {
    public String x(){return "Child2.x";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        Parent obj = new Child1();
        Parent obj2 = new Child2();
        System.out.println(obj.x());
        obj.a = 4 ;


        System.out.println(obj2.x());
    }
}