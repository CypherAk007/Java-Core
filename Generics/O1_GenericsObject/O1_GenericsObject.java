package Generics.O1_GenericsObject;

public class O1_GenericsObject {
    public static void main(String[] args) {
        GenericObject<Integer> i = new GenericObject<>(10);
        i.setValue(11);
//        i.setValue("Hello");//Error as req integer
        System.out.println(i.getValue());
    }
}
