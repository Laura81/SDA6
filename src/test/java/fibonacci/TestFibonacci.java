package fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class TestFibonacci {

    @Test
    public void testCorrectFirstNumber() {
        Fibonacci fibonacci = new Fibonacci();
        int expectedResult = 0;
        int actualResult = fibonacci.getTerm(0);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCorrectSecondNumber() {
        Fibonacci fibonacci = new Fibonacci();
        int expectedResult = 1;
        int actualResult = fibonacci.getTerm(1);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
