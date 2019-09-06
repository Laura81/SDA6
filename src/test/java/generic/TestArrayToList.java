package generic;

import org.junit.Test;

import java.util.List;

public class TestArrayToList {

    @Test
    public void test(){
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"A", "b", "C"};
        ArrayToList a = new ArrayToList();

        List<String> actualStrList=a.arrayToList(strArray);
        List<Integer> actualIntList=a.arrayToList(intArray);

    }
}
