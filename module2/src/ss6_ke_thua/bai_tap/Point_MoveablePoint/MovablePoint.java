package ss6_ke_thua.bai_tap.Point_MoveablePoint;

public class MovablePoint extends Point{
    private float xSpeed =0.0f;
    private float ySpeed =0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float [] getSpeed(){
        float [] floats=new float[]{this.xSpeed,this.ySpeed};
     return floats;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x="+getX()+
                "xSpeed=" + xSpeed +
                "y="+getY()+
                ", ySpeed=" + ySpeed +
                '}';
    }
    public  MovablePoint move(){
      this.setX(this.getX()+this.getxSpeed());
      this.setY(this.getY()+this.getySpeed());
      return this;

    }
}
