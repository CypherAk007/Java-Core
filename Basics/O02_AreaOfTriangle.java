package Basics;
import java.lang.*;
import java.util.Scanner;
public class O02_AreaOfTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b,h;
        double area;
        System.out.println("Enter bredth : ");
        b = s.nextInt();

        System.out.println("Enter height : ");
        h = s.nextInt();

        area = 0.5*b*h;
        System.out.println("Area : "+area);

        double x,y,z,ar,side;
        System.out.println("Enter a :");
        x =s.nextDouble();
        System.out.println("Enter b :");
        y =s.nextDouble();
        System.out.println("Enter c :");
        z =s.nextDouble();
        side = 0.5*(x+y+z);
        ar = Math.sqrt(side*(side-x)*(side-y)*(side-z));
        System.out.printf("Area : %.2f",ar);

        
    }
}
