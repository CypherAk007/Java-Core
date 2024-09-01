package ObjectOriented;

class Circle {
    private double radius;

    public Circle() {
        radius = 5;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class O11_AreaCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        // radius is private 
        // c1.radius = 2;
        // c1.setRadius(2);
        System.out.println(c1.getRadius());
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
