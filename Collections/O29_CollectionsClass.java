package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class O29_CollectionsClass {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(34);
        l.add(33);
        l.add(32);
        l.add(31);
        l.add(30);
        Collections.sort(l, Comparator.reverseOrder());
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);

        // Compare Custom Students class objects
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("ak", 1));
        list.add(new Student("bk", 2));
        list.add(new Student("ck", 3));
        list.add(new Student("dk", 4));

        // To sort the list add custom comparator using Comparable interface on Student
        Collections.sort(list);
        System.out.println(list);

        // Sort in terms of name
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Collections.sort(list,
                (Student o1, Student o2) -> {
                    return o1.name.compareTo(o2.name);

                });
        System.out.println(list);

    }
}
