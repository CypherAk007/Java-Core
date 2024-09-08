package ObjectOriented;

@FunctionalInterface
interface MyLambda {
    public void display();
}

class My implements MyLambda { 
    public void display() {
        System.out.println("Hello World!!");
    }
}

public class O018_lambdaExpession {
    public static void main(String[] args) {
        // M1
        // My m = new My();
        // m.display();

        // M2
        // MyLambda interface ref extended class->My obj
        // MyLambda m = new My();
        // m.display();

        // M3 -> inner class
        // MyLambda inner = new MyLambda() {
        // public void display(){
        // System.out.println("Hello World");
        // }
        // };
        // inner.display();

        // M4 -> Lambda expression
        MyLambda lamb = () -> {
            System.out.println("Hello World");

        };
        lamb.display();
    }
}