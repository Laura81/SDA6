package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyCollection {

    public static void main(String[] args) {

        List<Integer> m = new ArrayList<>();
        m.add(3);
        m.add(2);
        m.add(4);
        m.add(5);
        System.out.println(m);
        //m.remove(2);
        System.out.println(m);

        m.contains(10);
        System.out.println(m.contains(10));

        Collections.sort(m);
        System.out.println(m);

        List<Integer> r = new ArrayList<>();
        r.add(9);
        r.add(10);
        r.addAll(m);
        //System.out.println(r);

        //Collections.copy(m, r);
       // System.out.println(r);

        Collections.swap(m, 0, 3);
        System.out.println(m);






    }




}
