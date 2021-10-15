package ss6_ke_thua.bai_tap.point2D_point3D;

public class Point3D extends Point2D {
//    thuoc tinh
    private float z=0.0f;

//    phuon thuc

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setxyz() {
        super.setxy();
        this.z=z;
    }


    public float[] getxyz() {
        float[] floats = new float[]{this.getX(), this.getY(), this.z};
        return floats;
    }

//    toString

    @Override
    public String toString() {
            return "Point3D{" + super.toString() + ",z=" + this.z + "}";

    }
}
