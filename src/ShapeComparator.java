public class ShapeComparator implements java.util.Comparator<ShapeResizeable> {
    @Override
    public int compare(ShapeResizeable s1, ShapeResizeable s2) {
        if (s1.getArea() > s2.getArea()) return 1;
        else if (s1.getArea() < s2.getArea()) return -1;
        else return 0;
    }
}