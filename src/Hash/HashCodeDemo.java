package Hash;

class Data{
    private int a=1;
    String text = "gd";
}
public class HashCodeDemo {
    public static void main(String[] args) {
        String name = "해성";
        String name2 = "해성";
        String name3 = new String("해성");
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());

        Object object = new Object();
        Object object2 = new Object();
        System.out.println(new Data().equals(new Data()));

        System.out.println(object.hashCode());
        System.out.println(object2.hashCode());
        System.out.println(new Data().hashCode());
        System.out.println(new Data().hashCode());
        System.out.println(new Data().text.hashCode());
        System.out.println(new Data().text.hashCode());

    }
}
