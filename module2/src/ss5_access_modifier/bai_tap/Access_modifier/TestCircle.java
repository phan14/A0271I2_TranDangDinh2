package ss5_access_modifier.bai_tap.Access_modifier;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle = new Circle(3.0D);
        System.out.println("Diện tích hình tròn có bán kính = " + circle.getRadius() + " \nlà: " + circle.getArea());
        Circle circle1 = new Circle();
        circle1.setRadius(10.0D);
        System.out.println("Diện tích hình tròn có bán kính = " + circle1.getRadius() + " \nlà: " + circle1.getArea());
    }
}


