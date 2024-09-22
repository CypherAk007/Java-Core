package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class O29_CollectionsClass {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(34);
        l.add(43);
        l.add(52);
        l.add(61);
        l.add(30);
        Collections.sort(l, Comparator.reverseOrder());
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        //  compare based on last digit 
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i,Integer j){
                if(i%10>j%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(l,com);
        System.out.println(l);

        List<String> ls = new ArrayList<>();
        ls.add("ak");
        ls.add("bk");
        ls.add("abc");
        ls.add("abhishek");
        ls.add("dk");
        ls.add("ck");
        Collections.sort(ls, Comparator.reverseOrder());
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);
        System.out.println("-------------");
        Comparator<String> cs = new Comparator<String>() {
            @Override
            public int compare(String i, String j){
                if(i.length()>j.length()){
                    return -1;
                }else if(i.length()==j.length()){
                    return 0;
                }else{
                    return 1;
                }
            }
        };

        Collections.sort(ls,cs);
        System.out.println(ls);

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

        // Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        // Comparator<int[]> com = new Comparator<int[]>() {
        //     @Override
        //     public int compare(int[] i1, int[] i2) {
        //         return Integer.compare(i1[0], i2[0]);
        //     }
        // };
        
        // Arrays.sort(intervals, com);

        // sort based on a0,b0 and a1,b1
        // Arrays.sort(intervals,(a,b)-> { 
        //     if (a[0]!=b[0]){
        //         return Integer.compare(a[0],b[0]);
        //     }else{
        //         return Integer.compare(a[1],b[1]);
        //     }
        // });

    }
}
