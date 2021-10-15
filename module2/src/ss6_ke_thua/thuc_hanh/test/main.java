package ss6_ke_thua.thuc_hanh.test;

import ss6_ke_thua.thuc_hanh.Circle;
import ss6_ke_thua.thuc_hanh.Rectangle;
import ss6_ke_thua.thuc_hanh.Shape;
import ss6_ke_thua.thuc_hanh.Square;

public class main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

//        ---Circle
        System.out.println("---Circle---");
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

//        --RetangleTest
        System.out.println("---RetangleTest---");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

//        ----Square -
        System.out.println("----Square ----");
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
