package ss5_access_modifier.bai_tap.Access_modifier;

public class Circle {
    private  double radius =1.0d;
    private String color="red";


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
//    --
    public double getArea(){
        return this.radius*this.radius* Math.PI;
    }
}
