package insertion;

import org.junit.Test;
import java.util.Arrays;

public class TestInsertionSort {

    @Test
    public void test() {
        int[] noToBeSorted = {6, 4, 3, 2, 1, 5, 9};
        InsertionSort is = new InsertionSort();
        System.out.println(Arrays.toString(noToBeSorted));

        is.sort(noToBeSorted);
        System.out.println(Arrays.toString(noToBeSorted));

    }
}
