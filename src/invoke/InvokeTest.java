package invoke;

interface Function{
    public void invoke();
}

public class InvokeTest {
    public static void doSomething(Function action){
        action.invoke();
    }

    public static void main(String[] args) {
        doSomething(
                new Function() {
                    @Override
                    public void invoke() {
                        System.out.println("출력");
                    }
                }
        );
    }
}
