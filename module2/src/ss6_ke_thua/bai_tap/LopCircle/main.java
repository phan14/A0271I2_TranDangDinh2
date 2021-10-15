package ss6_ke_thua.bai_tap.LopCircle;

import ss6_ke_thua.bai_tap.LopCircle.Circle;
import ss6_ke_thua.bai_tap.LopCircle.Cylinder;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle();
        circle1.setColor("đỏ");
        circle1.setRadius(20.0D);
        System.out.println(circle1);

//        hinh trụ
        System.out.println("----Cylinder-------");
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder();
        cylinder1.setColor("tím");
        cylinder1.setHeight(15.0D);
        cylinder1.setRadius(6.0D);
        System.out.println(cylinder1);
    }
}
