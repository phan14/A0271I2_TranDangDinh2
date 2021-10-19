package ss7_Abstract_Class_Interface.thuc_hanh.Comparable_hinh_hoc;


public class ComparableCircle extends Cricle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public int compareTo(ComparableCircle o) {
        if (this.getRadius() > o.getRadius()) {
            return 1;
        } else {
            return this.getRadius() < o.getRadius() ? -1 : 1;
        }
    }
}
