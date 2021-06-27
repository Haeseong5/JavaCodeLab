package DesignPattern.AdapterPattern.webRequest;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        WebAdapter adapter = new WebAdapter(new FancyRequester());
        WebClient client = new WebClient(adapter);

        WebClient client1 = new WebClient(new OldWebRequester());
        client1.doWork();

        client.doWork();

    }
}
