package Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student implements Comparable<Student>{
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString() {
        return "Student{'name: " + name + "\'" + ",rollNo:" + rollNo + "}";
    }

    public int hashCode(){
        return Objects.hash(this.rollNo);
    }

    public boolean equals(Object o){
        if (this==o){
            return true;
        };
        if (o==null||getClass()!=o.getClass()){
            return false;
        }    
        Student student  = (Student) o;
        return rollNo==student.rollNo;
        
    }

    @Override
    public int compareTo(Student that) {
    //    +ve -> this object is returned
    //    -ve -> that object is returned
    //    0 -> both are equal 

    return this.rollNo-that.rollNo;
    }
    // s1.compareTo(s2);
}

public class O26_CustomSet {
    public static void main(String[] args) {
        Set<Student> s = new HashSet<>();
        s.add(new Student("Ram", 1));
        s.add(new Student("Sam", 2));
        s.add(new Student("Tam", 3));
        s.add(new Student("Ram", 1));

        System.out.println(s);

    }
}
