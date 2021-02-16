package interfaceExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("sd");
        System.out.println(list.get(0));

        List<String> list1 = new LinkedList<>();
        list1.add("23");

        //둘다 List 타입 인스턴스지만, 자식메서드에서 add를 재정의하여 서로 다르게 동작함
    }
}
