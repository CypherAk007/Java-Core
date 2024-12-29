package Generics.O0_GenricsPair;

public class Client {
    public static void main(String[] args) {
        IPair<Double,Double> coordinates = new Pair<>(3.67,2.44);
        IPair<String,String> message = new Pair<>("Vishal","Hello World");
        IPair<Integer,String> student = new Pair<>(1, "Vishal");

        String first = message.getFirst();
        System.out.println(first.length());
        
    }
}
