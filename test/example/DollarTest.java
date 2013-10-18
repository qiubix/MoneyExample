package example;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;

public class DollarTest {
    @Before
    public void setUp() throws Exception {

    }

    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    @After
    public void tearDown() throws Exception {

    }
}
