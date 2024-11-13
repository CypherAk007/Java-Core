package DSA.Stacks.KStacksInArray;

public class Main {
    public static void main(String[] args) {
        KStack ks = new KStack(3,6); // no. of stacks | size of arr
        System.out.println(ks.push(10,1));
        ks.peek(1);
        System.out.println(ks.push(20,1));
        ks.peek(1);
        System.out.println(ks.push(30,1));
        ks.peek(1);
        System.out.println(ks.pop(1));
//        ks.peek(1);
        System.out.println(ks.pop(1));
        ks.peek(1);
    }
}
