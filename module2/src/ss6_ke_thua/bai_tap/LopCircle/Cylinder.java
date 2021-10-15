package ss6_ke_thua.bai_tap.LopCircle;

public class Cylinder extends Circle{
//    thuoc tinh
private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSquare() {
        return this.height * this.getRadius() * this.getRadius() * Math.PI;
    }

    public String toString() {
        return " Hình trụ có chiều cao = " + this.height + "\n "
                + super.toString() + " Thể tích = " + this.getSquare();
    }
}

