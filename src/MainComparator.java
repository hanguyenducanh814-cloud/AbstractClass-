import java.util.*;

public class MainComparator {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circles(5.0));
        shapes.add(new Circles(2.0));
        shapes.add(new Circles(8.0));

        System.out.println("Trước khi sắp xếp:");
        shapes.forEach(System.out::println);
        Collections.sort(shapes, new ShapeComparator());
        System.out.println("\nSau khi sắp xếp (Diện tích tăng dần):");
        shapes.forEach(System.out::println);
    }
}