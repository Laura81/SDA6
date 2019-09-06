package generic;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    public <T> List<T> arrayToList(T[] a) {
    List<T> list = new ArrayList<>();
        for (T element : a) {
            System.out.print(element);
        }

        System.out.println();
        return list;
    }
}
