package Basics;

import java.lang.*;
import java.util.Scanner;



class O01_HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 2 No's: ");
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("The output of "+a+" + "+b+" = "+c);

        // ---------------------
        // Read name and print it 
        String name;
        System.out.println("Enter your name: ");
        name = s.next();
        System.out.println("Hello "+name+" !!");

    }
}

// Commands to run java file : 
// javac Basics/O01_HelloWorld.java
// JAVA_CORE % java Basics.O01_HelloWorld