public class MainColorable {
    public static void main(String[] args) {
        ShapeResizeable[] shapes = new ShapeResizeable[3];
        shapes[0] = new CircleResizeable(5.0);
        shapes[1] = new SquareColorable(10.0);
        shapes[2] = new RectangleResizeable(5.0, 10.0);

        for (ShapeResizeable shape : shapes) {
            System.out.println("Diện tích: " + shape.getArea());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}