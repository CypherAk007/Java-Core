package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2,"Ak",25,90));
        students.add(new Student(3,"Bk",26,95));
        students.add(new Student(4,"Ck",27,96));
        students.add(new Student(1,"Dk",28,97));
        students.add(new Student(1,"Mk",29,98));

        System.out.println(students);

//        Using comparable
//        Collections.sort(students);

//        Using comparator to sort based on psp
//        Collections.sort(students,new StudentPspComparator());

//        sorting based on name
        Collections.sort(students,(s1,s2)->s1.getName().compareTo(s2.getName()));


        System.out.println(students);

    }
}
