package Callback.callback;

/**
 * 콜백 구현은 A클래스에서 동작할 수 없고 B클래스에서만 동작할 수 있는 메서드를  A클래스에서 인터페이스로 선언하여 B클래스에서 정의하고 A측에서 호출할 수 있도록 한다.
 *
 * 이는 안드로이드의 특정 컴포넌트에서는 해결할 수 없는 문제를 다른 컴포넌트에서 해결 가능하게 만들어주는 것과 같은 곳들에 응용 가능하므로 매우 중요한 개념이라 할 수 있다.
 */
public class Controller {
    public static void main(String[] args) {
        Callback callback = new Callback() {
            @Override
            public void onSuccess(DataResponse dataResponse) {
                System.out.println(dataResponse.code);
                System.out.println(dataResponse.message);
            }

            @Override
            public void onFailure(DataResponse dataResponse) {
                System.out.println(dataResponse.code);
                System.out.println(dataResponse.message);
            }
        };

        Callee callee = new Callee();
        callee.setCallback(callback);
        callee.execute();
    }
}
