package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("toto", "tyty");
        String x = myMap.put("toto", "gigi");
        System.out.println(myMap.get("toto"));

    }
}
