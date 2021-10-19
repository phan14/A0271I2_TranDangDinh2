package ss6_ke_thua.bai_tap.point2D_point3D;

public class Point2D {
//    thuoc tinh
    private float x =0.0f;
    private float y =0.0f;

//    phuong thuc

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxy( float x,float y){
      this.x=x;
      this.y=y;

    }
    public float [] getxy(){
        float[] floats=new float[] {this.x,this.y};
        return floats;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
