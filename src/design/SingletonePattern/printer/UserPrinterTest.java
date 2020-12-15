package design.SingletonePattern.printer;

import junit.framework.TestCase;

public class UserPrinterTest extends TestCase {
    public void testDoSomething(){
        FakePrinter fakePrinter = new FakePrinter();
        UserPrinter userPrinter = new UserPrinter();
    }
}
