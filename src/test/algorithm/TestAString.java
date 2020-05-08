package test.algorithm;

import com.algorithm.AString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAString {
    private AString aString;

    public TestAString() {
        aString = new AString();
    }

    @Test
    public void testAtoi() {
        assertEquals(-42, aString.atoi("   -42"));
        assertEquals(4193, aString.atoi("4193 with words"));
        assertEquals(0, aString.atoi("words and 987"));
        assertEquals(-2147483648, aString.atoi("-91283472332"));
        assertEquals(245, aString.atoi(" +245"));
        assertEquals(0, aString.atoi("     "));
    }
}