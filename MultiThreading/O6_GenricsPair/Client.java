package MultiThreading.O6_GenricsPair;

public class Client {
    public static void main(String[] args) {
        Pair<Double,Double> coordinates = new Pair<>(3.67,2.44);
        Pair<String,String> message = new Pair<>("Vishal","Hello World");
        Pair<Integer,String> student = new Pair<>(1, "Vishal");

        String first = message.geFirst();
        System.out.println(first.length());
        
    }
}
