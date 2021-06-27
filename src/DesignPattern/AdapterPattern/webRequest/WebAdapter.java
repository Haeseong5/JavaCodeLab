package DesignPattern.AdapterPattern.webRequest;

/** *
 * 이렇게 하면 WebAdapter 도 WebRequester 인터페이스를 구현했으므로,
 * WebRequester 인터페이스의 구현체를 받아 동작하던 WebClient 에 WebAdapter 를 넘겨줄 수 있고,
 * 기존에 WebClient 에서 requesterHandler() 메소드를 호출하던 코드는 그대로 두면서도,
 * WebAdapter 의 requestHandler() 를 통해 써드파티 라이브러리인 FancyRequester 를 사용할 수 있게 된다.
 */
public class WebAdapter implements WebRequester{
    private final FancyRequester fancyRequester;

    public WebAdapter(FancyRequester fancyRequester) {
        this.fancyRequester = fancyRequester;
    }
    @Override
    public void requestHandler() {
        fancyRequester.fancyRequestHandler();
    }
}
