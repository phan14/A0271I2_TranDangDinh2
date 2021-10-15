package ss6_ke_thua.bai_tap.point2D_point3D;

public class main {
    public static void main(String[] args) {
        Point2D point2d = new Point2D();
        point2d.setX(5.0F);
        point2d.setY(7.0F);
        System.out.println(point2d.toString());

        System.out.println("-----POINT 3D----");
        Point3D point3D=new Point3D();
        point3D.setX(6.0f);
        point3D.setY(10.0f);
        point3D.setZ(8.0f);
        System.out.println(point3D.toString());
    }
}
