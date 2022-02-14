import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashTest {


    Cash cash;
    @Before
    public void before(){
        cash = new Cash(1000);
    }

    @Test
    public void canIPay(){
        assertEquals("I paid",cash.pay());
    }
}
