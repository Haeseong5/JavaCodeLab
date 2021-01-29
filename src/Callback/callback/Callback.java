package Callback.callback;

/**
 콜백함수란
 * 1. 다른 함수의 인자로써 이용되는 함수.
 * 2. 어떤 이벤트에 의해 호출되어지는 함수.
 */
public interface Callback {
    public void onSuccess(DataResponse dataResponse);
    public void onFailure(DataResponse dataResponse);
}