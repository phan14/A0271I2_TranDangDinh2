package ss7_Abstract_Class_Interface.bai_tap.interface_esizeable;


import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);

        Random random =new Random();
        Rectangle[] rectangle =new Rectangle [20];
        int length = rectangle.length;
        // int array circle
        for (int i = 0; i < length; i++) {
            rectangle [i] =new Rectangle(10,50);
        }

        for (int i = 0; i < length; i++) {
            System.out.println("=======================================================");
            System.out.println("Shape " + (i + 1) + " :");
            System.out.println("Area before resize: " + rectangle[i].getArea());
            int percent = (int)(random.nextDouble() * 100);
            System.out.println("Percent: " + percent);
            rectangle[i].resize(percent);
            System.out.println("Area after resize: " + rectangle[i].getArea());
        }
    }
}
