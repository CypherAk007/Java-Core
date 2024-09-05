package ObjectOriented;


abstract class Super{
    public Super(){
        System.out.println("Super constructor called!!");
    }
    public void meth1(){
        System.out.println("Meth1 of Super");
    }
    abstract public void meth2();
}

class Sub extends Super{
    public Sub(){
        System.out.println("Constructor of Sub Called !!");
    }
    public void meth2(){
        System.out.println("Meth2 from Sub!!");
    }
}
abstract class Animal {
    String name;

    // Constructor of the abstract class
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    // Abstract method (must be implemented by subclasses)
    abstract void makeSound();

    // Non-abstract method
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Calls the constructor of the abstract class
    }
  

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}
public class O013_AbstractClasses {
    public static void main(String[] args) {
        Super s1 = new Sub();
        s1.meth1();
        s1.meth2();
        Animal d[] = new Animal[100];
        Dog dog = new Dog("Buddy"); // This will invoke Animal's constructor
        dog.makeSound();
        dog.sleep();
    }
}
