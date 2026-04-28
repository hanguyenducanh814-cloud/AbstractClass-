public class SquareColorable extends RectangleResizeable implements Colorable {

    public SquareColorable(double side) {
        super(side, side);
    }

    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    public String toString() {
        return "A Square with side = "  + ", which is a subclass of " + super.toString();
    }
}