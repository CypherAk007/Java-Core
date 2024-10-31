package Collections.O31_CustomStack;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(18);

//read the input------------------
//        Input Format
//
//        The first line contains an integer,  (the number of games). The  subsequent lines describe each game in the following format:
//
//        The first line contains three space-separated integers describing the respective values of  (the number of integers in stack ),  (the number of integers in stack ), and  (the number that the sum of the integers removed from the two stacks cannot exceed).
//                The second line contains  space-separated integers, the respective values of .
//                The third line contains  space-separated integers, the respective values of .
//        1
//        5 4 10
//        4 2 4 6 1
//        2 1 8 5
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }for(int j=0;j<m;j++){
                b[j] = sc.nextInt();
            }
        }
    }
}
