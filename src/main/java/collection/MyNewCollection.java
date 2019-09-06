package collection;

import java.util.*;

public class MyNewCollection {

    public static void main(String[] args) {
        List<String> b = new ArrayList<>();
       // b.add("Caine");
       // b.add("Pisica");
       // b.add("Soricel");
       // b.add("Animal");
       // System.out.println(b);
       // ListIterator<String> stringListIterator = b.listIterator(1);
       // while (stringListIterator.hasNext()) {
       //    System.out.print(stringListIterator.next() + ", ");
       // }

       // System.out.println(((LinkedList<String>)b).getFirst());
       // System.out.println(((LinkedList<String>)b).getLast());

        HashSet<String> mySet = new HashSet<>();
        mySet.add("a");
        mySet.add("bb");
        mySet.add("ccc");
        mySet.add("DDDD");
        System.out.println("HashSet is:"+mySet);

        List<String> myList = new ArrayList<String>(mySet);
        System.out.println("ArrayList contain:"+myList);

        HashSet<Integer> firstSet=new HashSet<>();
        firstSet.add(3);
        firstSet.add(5);
        HashSet<Integer>secondSet=new HashSet<>();
        secondSet.add(6);
        secondSet.add(7);
        System.out.println(firstSet);
        System.out.println(secondSet);
        




    }
}
