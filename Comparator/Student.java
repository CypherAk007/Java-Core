package Comparator;

public class Student implements Comparable<Student> {
    private int id;
    private int age;
    private int psp;
    private String name;

    public Student(int id,String name, int age, int psp ) {
        this.id = id;
        this.age = age;
        this.psp = psp;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return " Id: "+id+" Name: "+name+" Age: "+age+" PSP: "+psp;
    }

    @Override
    public int compareTo(Student other){

        if(this.id<other.id){
//            return current student ->  Left
            return -1;
        }else if(this.id>other.id){
//            return other student -> Right
            return 1;
        }else{
//            if Id's are same then compare the age
            int ageComparison = Integer.compare(this.age,other.age);
            if(ageComparison!=0){
                return ageComparison;
            }else{
                return Integer.compare(this.psp,other.psp);
//                or
//                return this.psp-other.psp;
            }

        }
    }
}
