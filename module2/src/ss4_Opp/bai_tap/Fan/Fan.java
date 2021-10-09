package ss4_Opp.bai_tap.Fan;

public class Fan {
    private final int SLOW =1;
    private final int MEDIUM =2;
    private final int FAST =3;

    private int speed=1;
    private boolean on=false;
    private double radius = 5.0D;
    private String color ="blue";

//get và set

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


//    hàm khởi tạo k có tham số

    public Fan() {
    }

    public String toString(){
        return this.on ? "fan is on\nSpeed: " + this.speed + "\nColor: " + this.color + "\nRadius: " + this.radius :
                "fan is off\nColor: " + this.color + "\nRadius: " + this.radius;
    }
}
