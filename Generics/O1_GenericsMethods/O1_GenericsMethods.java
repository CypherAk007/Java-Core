package Generics.O1_GenericsMethods;

public class O1_GenericsMethods {
    public static void main(String[] args) {
        GenericMethod m = new GenericMethod();

        String[] arr = new String[]{"Hello","World"};
//        m.print(arr); // Error due to <E extends Number>
//        reason: inference variable E has incompatible bounds
//        upper bounds: java.lang.Number
//        lower bounds: java.lang.String

        Integer[] numArr = new Integer[]{1,2,3,4};
        m.print(numArr);
    }
}
