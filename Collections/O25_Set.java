package Collections;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class O25_Set {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(12);
        s.add(13);
        s.add(14);
        s.add(16);

        System.out.println(s);
        s.remove(12);
        System.out.println(s.contains(12));
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.println(s);

        // Maintains Order in which we input
        // Set<Integer> s = new LinkedHashSet<>();

        
        // All operations O(logn)
        // It maintains sorted order  - > BST
        // Set<Integer> set = new TreeSet<>();

    }
}
