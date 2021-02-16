package Wrapper;

public class WrapperTest {
    public static void main(String[] args) {
        Integer integer = new Integer(10); //힙영역에 객체 저장됨
        Integer integer1 = new Integer(10);
        System.out.println(integer == integer1);
    }
}
