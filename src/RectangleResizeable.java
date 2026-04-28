    public class RectangleResizeable extends ShapeResizeable implements Resizeable {
    private double width;
    private double length;

    public RectangleResizeable(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 *(width + length);
    }
    public void resize(double percent) {
        this.width *= (1 + percent / 100);
        this.length *= (1 + percent / 100);
    }

    public String toString() {
        return "Rectangle width: " + width + ", length: " + length;
    }
}