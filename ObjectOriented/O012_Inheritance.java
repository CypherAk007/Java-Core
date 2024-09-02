package ObjectOriented;

class Parent {
    int xx = 10;

    public Parent() {
        System.out.println("This is parent Constructor!!");
    }

    public Parent(int x) {
        System.out.println("1 parent param " + x);
    }

    public void display() {
        System.out.println("From parent class display");
    }
}

class Child extends Parent {
    int xx = 20;

    public Child() {
        System.out.println("This is child Constructor!!");
    }

    public Child(int x, int y) {
        super(x);
        System.out.println("test cur variables" + xx);
        System.out.println("test cur variables but from par" + super.xx);
        System.out.println("1 child param " + y);
    }

    public void display() {
        super.display();
        System.out.println("From child class display");
    }
}

public class O012_Inheritance {

    public static void main(String[] args) {
        // Child c1 = new Child();
        Child c2 = new Child(10, 20);
        c2.display();
    }
}
// No enclosing instance of type O012_Inheritance is accessible. Must qualify
// the allocation with an enclosing instance of type O012_Inheritance (e.g.
// x.new A() where x is an instance of O012_Inheritance).