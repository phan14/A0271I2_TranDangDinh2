package ss6_ke_thua.bai_tap.Point_MoveablePoint;

public class main {
    public static void main(String[] args) {
        Point point=new Point(5.0f,7.0f);
        System.out.println(point.toString());

        System.out.println("\n ------MoveablePoint--------");
        MovablePoint movablePoint = new MovablePoint(6.0F, 8.0F, 2.0F, 5.0F);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
