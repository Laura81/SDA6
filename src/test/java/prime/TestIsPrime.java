package prime;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestIsPrime {

    @Test

    public void testCheckPrimeNumbersTrue() {
        int n = 5;
        IsPrime isPrime = new IsPrime();
        boolean actualResult = isPrime.isPrimeNumber(n);
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCheckArray() {
        int[] a = new int[]{1, 2, 3, 5, 7, 10, 12};
        int[] expected = new int[]{1, 2, 3, 5, 7, 10, 12};

        IsPrime isPrime = new IsPrime();
        int[] actualResult = isPrime.arrayPrimeNumber(a);
        int[] expectedResult = new int[]{3, 5, 7};

        Assert.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
}
