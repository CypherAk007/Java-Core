package Basics;
import java.util.Scanner;
public class O03_SwapBitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b :");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a: "+a+" b: "+b);

        byte x=9,y =12;
        byte c;
        c = (byte)(x<<4);
        System.out.println(c);
        c = (byte)(c|y);
        System.out.println(c);
        // get the 9 now as output 
        System.out.println((c&0b11110000)>>4);
        // get the 12 now as output 
        System.out.println((c&0b00001111));

        float z = 12.2f;
        x= (byte)z;
        System.out.println(x,);

    }
}
