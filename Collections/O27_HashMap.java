package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class O27_HashMap {
    public static void main(String[] args) {
        // Map<String, Integer> hm = new HashMap<>();

        // Put keys in BST -> sort the keys
        Map<String, Integer> hm = new TreeMap<>();

        hm.put("Three", 3);
        hm.put("Five", 5);
        hm.put("six", 6);
        hm.put("Four", 4);

        hm.remove("Three");

        if (!hm.containsKey("six")) {
            hm.put("six", 66);
        }
        System.out.println(hm);

        System.out.println(hm.containsValue(6));

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key : hm.keySet()) {
            System.out.println(key);
        }

        for (Integer value : hm.values()) {
            System.out.println(value);
        }
    }
}
