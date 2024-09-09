package Collections;

import java.util.Stack;

public class O21_Stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Tiger");

        System.out.println("Stack " + animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println("Stack " + animals);

    }
}
