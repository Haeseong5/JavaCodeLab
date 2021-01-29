package DesignPattern.SingletonePattern.printer;

import junit.framework.TestCase;

public class ClientTest extends TestCase {
    public void testDoSomething(){
        FakePrinter fakePrinter = new FakePrinter();
        UserPrinter userPrinter = new UserPrinter();
    }
}
