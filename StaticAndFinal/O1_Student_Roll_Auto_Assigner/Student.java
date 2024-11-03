package StaticAndFinal.O1_Student_Roll_Auto_Assigner;

import java.util.Date;

public class Student {
    private static int counter=1;
    private String name;
    private String rollNumber;
    public Student(String name){
        this.name = name;
        this.rollNumber = getRollNumber();
    }

    public String getRollNumber() {
        Date date = new Date();
        String rn = "Univ-"+date.getYear()+1900+"-"+counter;
        counter++;
        return rn;
    }

    public void printStudent(){
        System.out.println(name+" "+rollNumber);
    }
}
