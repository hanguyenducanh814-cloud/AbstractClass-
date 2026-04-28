 abstract class Shape {
    public abstract double getArea();
}

public class Circles extends Shape {
    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle{area=" + getArea() + "}";
    }
}
