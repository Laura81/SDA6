package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {
    //1: Write a Java program to check whether a map contains a specific entry
    //2: Write a Java program to get a set view of the keys contained in this map
    //3: Write a Java program ti get a set view of the ENTRIES contained in this map
    //4: Create a TreeMap and add some elements. Print the treemap and notice the order of the elements

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Animal");
        map.put(2, "Cow");
        map.put(3, "Dog");
        map.put(4, "Cat");
        map.put(5, "Fish");

        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Cow"));
        System.out.println(map.containsKey(6));
        System.out.println(map.containsValue("Mouse"));
        boolean dog = map.get(3).equals("Dog");
        System.out.println(dog);

        map.keySet();
        System.out.println(map.keySet());

        map.entrySet();
        System.out.println(map.entrySet());

        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(5, "Honey");
        tree.put(9, "Apples");
        tree.put(2, "Pears");
        tree.put(4, "Peanuts");

        System.out.println(tree.entrySet());
        System.out.println(tree.descendingKeySet());
        System.out.println(tree.get(2));
        System.out.println(tree.ceilingEntry(5));
    }
}
