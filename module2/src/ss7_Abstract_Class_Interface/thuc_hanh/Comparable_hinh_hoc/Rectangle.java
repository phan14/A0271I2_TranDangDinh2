package ss7_Abstract_Class_Interface.thuc_hanh.Comparable_hinh_hoc;


public class Rectangle extends Shape {
    private double width = 1.0D;
    private double length = 1.0D;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2.0D * (this.width + this.length);
    }

    public String toString() {
        return "A Rectangle with width=" + this.getWidth() + " and length=" + this.getLength() + ", which is a subclass of " + super.toString();
    }
}
