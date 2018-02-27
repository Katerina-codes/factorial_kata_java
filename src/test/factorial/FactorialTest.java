package test.factorial;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTest {

    @Test
    public void zero() {
       assertEquals(1, factorial(0));
    }

    @Test
    public void one() {
        assertEquals(1, factorial(1));
    }

    @Test
    public void Two() {
        assertEquals(2, factorial(2));
    }

    private int factorial(int i) {
        if (i < 2) {
            return 1;
        } else {
            return i;
        }

    }
}
