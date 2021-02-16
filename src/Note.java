public class Note {
    public static void main(String[] args) {
        String name1 = new String("hi"); //heap 메모리에 객체 생성
        String name2 = "hi"; //String Constant Pool에 생성
        String name3 = "hi"; //위에 만들어진 값을 참조함.

        System.out.println(name1 == name2);
        System.out.println(name3 == name2);

    }
}
