package ss6_ke_thua.bai_tap.LopCircle;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * 3.141592653589793D;
    }

    public String toString() {
        return "Hình tròn có bán kính =" + this.getRadius() + "\n và có màu sắc là: " + this.getColor() + "\n";
    }
}
