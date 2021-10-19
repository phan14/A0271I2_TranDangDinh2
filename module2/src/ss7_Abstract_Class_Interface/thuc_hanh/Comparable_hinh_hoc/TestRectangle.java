package ss7_Abstract_Class_Interface.thuc_hanh.Comparable_hinh_hoc;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(5.0D, 8.0D);
        System.out.println(rectangle);
        rectangle = new Rectangle(3.0D, 7.0D, "orange", true);
        System.out.println(rectangle);
    }
}
