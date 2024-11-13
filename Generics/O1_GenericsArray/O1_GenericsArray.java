package Generics.O1_GenericsArray;

public class O1_GenericsArray {
    public static void main(String[] args) {
        GenericArray<Integer> gArr = new GenericArray<>();
        gArr.append(10);
//        gArr.append("Ak"); // Error expected integer
        gArr.display();
    }
}
