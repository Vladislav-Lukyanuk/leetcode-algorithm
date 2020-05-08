package test.algorithm;

import com.algorithm.AInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAInteger {
    private AInteger aInteger;

    public TestAInteger() {
        aInteger = new AInteger();
    }

    @Test
    public void testReverse() {
        assertEquals(321, aInteger.reverse(123));
        assertEquals(-321, aInteger.reverse(-123));
        assertEquals(21, aInteger.reverse(120));
    }
}
