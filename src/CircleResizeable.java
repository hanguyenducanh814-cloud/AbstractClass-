public class CircleResizeable extends ShapeResizeable implements Resizeable {
    private double radius;

    public CircleResizeable(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public void resize(double percent) {
        this.radius *= (1 + percent / 100);
    }

    public String toString() {
        return "Circle radius: " + radius;
    }
}